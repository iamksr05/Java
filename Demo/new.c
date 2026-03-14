#include <stdio.h>
#include <stdlib.h>

#define MOD 998244353

typedef struct
{
    int to;
    int weight;
    int next;
} Edge;

int head[1000005];
Edge edges[2000005];
int edge_cnt = 0;
int parent[1000005];
int weight_to_parent[1000005];
int order[1000005];
int sz[1000005];
int n;

void add_edge(int u, int v, int w)
{
    edge_cnt++;
    edges[edge_cnt].to = v;
    edges[edge_cnt].weight = w;
    edges[edge_cnt].next = head[u];
    head[u] = edge_cnt;
}

void bfs(int start_node)
{
    int q_head = 0, q_tail = 0;
    order[q_tail++] = start_node;
    parent[start_node] = 0;

    while (q_head < q_tail)
    {
        int u = order[q_head++];
        for (int i = head[u]; i != 0; i = edges[i].next)
        {
            int v = edges[i].to;
            if (v != parent[u])
            {
                parent[v] = u;
                weight_to_parent[v] = edges[i].weight;
                order[q_tail++] = v;
            }
        }
    }
}

int main()
{
    if (scanf("%d", &n) != 1)
        return 0;

    for (int i = 0; i < n - 1; i++)
    {
        int u, v, w;
        scanf("%d %d %d", &u, &v, &w);
        add_edge(u, v, w);
        add_edge(v, u, w);
    }

    bfs(1);

    long long total_load = 0;
    long long ln = (long long)n;

    for (int i = n - 1; i >= 0; i--)
    {
        int u = order[i];
        sz[u]++;

        if (parent[u] != 0)
        {
            sz[parent[u]] += sz[u];

            long long s = (long long)sz[u];

            long long diff = 2 * s - ln;
            if (diff < 0)
                diff = -diff;

            long long multiplier = (ln % MOD) * (diff % MOD) % MOD;
            long long edge_weight = (long long)weight_to_parent[u] % MOD;

            long long load = (edge_weight * multiplier) % MOD;
            total_load = (total_load + load) % MOD;
        }
    }

    printf("%lld\n", total_load);

    return 0;
}