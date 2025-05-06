package top.javatool.canal.client.handler;

import java.util.Set;

/**
 * @author yang peng
 * @since 2019/3/2915:46
 */
public interface EntryHandler<T> {


    default boolean isLowerCamel() {
        return true;
    }

    default Set<String> listenerFields() {
        return null;
    }

    default void insert(T t) {

    }


    default void update(T before, T after) {

    }


    default void delete(T t) {

    }
}
