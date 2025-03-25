import pandas as pd
import matplotlib.pyplot as plt


data = pd.read_csv('results.csv')


plt.figure(figsize=(10, 6))
plt.plot(data['n'], data['InsertionSortTime(ns)'], label='Insertion Sort')
plt.plot(data['n'], data['MergeSortTime(ns)'], label='Merge Sort')
plt.xlabel('Tamanho do array (n)')
plt.ylabel('Tempo de execução (ns)')
plt.title('Comparação entre Insertion Sort e Merge Sort')
plt.legend()
plt.grid(True)
plt.savefig('sorting_comparison.png')
plt.show()