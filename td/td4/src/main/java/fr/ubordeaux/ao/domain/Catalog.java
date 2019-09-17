package fr.ubordeaux.ao.domain;

import java.util.Set;

public interface Catalog {
    public int size();
    public Set<Reference> getReferences();
    public Reference findReferenceById(String id);
    public void addReference(Reference reference);
    public void removeReference(Reference reference);
}