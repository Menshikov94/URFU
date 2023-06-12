package kurs;

// Java-программа для демонстрации реализации нашей
// собственной хеш-таблицы с цепочкой для обнаружения коллизий

import java.util.ArrayList;
import java.util.Objects;

// Узел цепочек
class HashNode<K, V> {
    K key;
    V value;
    final int hashCode;

    // Ссылка на следующий узел
    HashNode<K, V> next;

    // Конструктор
    public HashNode(K key, V value, int hashCode)
    {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

// Класс для представления всей хеш-таблицы
class Map<K, V> {
    // bucketArray используется для хранения массива цепочек
    private ArrayList<HashNode<K, V> > bucketArray;

    // Текущая емкость списка массивов
    private int numBuckets;

    // Текущий размер списка массивов
    private int size;

    // Конструктор (инициализирует емкость, размер и
    // пустые цепочки.

    public Map()
    {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        // Создать пустые цепочки
        for (int i = 0; i < numBuckets; i++)
            bucketArray.add(null);
    }

    public int size() { return size; }
    public boolean isEmpty() { return size() == 0; }

    private final int hashCode (K key) {
        return Objects.hashCode(key);
    }

    // Реализует хеш-функцию для поиска индекса
    // для ключа

    private int getBucketIndex(K key)
    {
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;
        // key.hashCode() could be negative.
        index = index < 0 ? index * -1 : index;
        return index;
    }

    // Метод удаления данного ключа
    public V remove(K key)
    {
        // Применить хеш-функцию, чтобы найти индекс для данного ключа
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // Поиск ключа в своей цепочке
        HashNode<K, V> prev = null;
        while (head != null) {
            // Если ключ найден
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;

            // В противном случае продолжайте двигаться по цепочке
            prev = head;
            head = head.next;
        }

        // Если бы не было ключа
        if (head == null)
            return null;

        // Уменьшить размер
        size--;

        // Удалить ключ
        if (prev != null)
            prev.next = head.next;
        else
            bucketArray.set(bucketIndex, head.next);

        return head.value;
    }

    // Возвращает значение для ключа
    public V get(K key)
    {
        // Найти главу цепочки для данного ключа
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // Ключ поиска в цепочке
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode)
                return head.value;
            head = head.next;
        }

        // Если ключ не найден
        return null;
    }

    // Добавляет пару ключ-значение в хеш
    public void add(K key, V value)
    {
        // Найти главу цепочки для данного ключа
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // Проверьте, присутствует ли ключ
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Вставьте ключ в цепочку
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode
                = new HashNode<K, V>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        // Если коэффициент загрузки превышает пороговое значение
        // размер хеш-таблицы удваивается.

        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    // Метод драйвера для тестирования класса Map
    public static void main(String[] args)
    {
        Map<String, Integer> map = new Map<>();
        map.add("this", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);
        System.out.println(map.size());
        System.out.println(map.remove("this"));
        System.out.println(map.remove("this"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}

