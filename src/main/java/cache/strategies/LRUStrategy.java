package cache.strategies;

/*
 * Copyright (©) 2015. Rodionov Alexander
 */

/**
 * LRU (англ. Least Recently Used - Вытеснение давно неиспользуемых) — вытесняется буфер, неиспользованный дольше всех; в первую очередь, вытесняется неиспользованный дольше всех.
 * Этот алгоритм требует отслеживания того, что и когда использовалось, что может оказаться довольно накладно, особенно если нужно проводить дополнительную проверку, чтобы в этом убедиться.
 * Общая реализация этого метода требует сохранения «бита возраста» для строк кэша и за счет этого происходит отслеживание наименее использованных строк (то есть за счет сравнения таких битов).
 * В подобной реализации, при каждом обращении к строке кэша меняется «возраст» всех остальных строк.
 */

public class LRUStrategy<KeyType> extends CacheStrategy<KeyType> {
    @Override
    public void putObject(KeyType key) {
        treeMap.put(key, System.nanoTime());
    }
}