package fr.ubordeaux.ao.domain.model;

import java.util.Objects;

import fr.ubordeaux.ao.domain.exception.ReferenceManagementException;
import fr.ubordeaux.ao.domain.type.Price;

public class Reference {
    private String id;
    private String name;
    private String description;
    private Price basePrice;

    public Reference(String id, String name, String description, Price basePrice) {
        this.setReferenceId(id);
        this.setName(name);
        this.setDescription(description);
        this.setBasePrice(basePrice);
    }

    private void setReferenceId(String id) {
        if (id == null) throw new ReferenceManagementException("cannot create reference with null id");
        this.id = id;
    }

    private void setName(String name) {
        if (name == null) throw new ReferenceManagementException("cannot create reference with null name");
        this.name = name;
    }

    private void setDescription(String description) {
        if (description == null) throw new ReferenceManagementException("cannot create reference with null description");
        this.description = description;
    }

    private void setBasePrice(Price basePrice) {
        if (basePrice == null) throw new ReferenceManagementException("cannot create reference with null basePrice");
        this.basePrice = basePrice;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Price getBasePrice() {
        return this.basePrice;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Reference) {
            Reference otherReference = (Reference)other;
            boolean equals = this.getId().compareTo(otherReference.getId())==0;
			return equals;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Reference id="+id+ " name="+name+" description="+description;
    }
}
