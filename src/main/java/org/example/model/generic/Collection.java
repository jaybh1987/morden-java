package org.example.model.generic;

public interface Collection<E> {

    public boolean addAll(Collection<? extends E> c);
}
