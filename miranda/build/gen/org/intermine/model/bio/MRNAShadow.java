package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class MRNAShadow implements MRNA, ShadowClass
{
    public static final Class<MRNA> shadowOf = MRNA.class;
    // Col: org.intermine.model.bio.MRNA.miRNAinteractions
    protected java.util.Set<org.intermine.model.bio.MiRNATarget> miRNAinteractions = new java.util.HashSet<org.intermine.model.bio.MiRNATarget>();
    public java.util.Set<org.intermine.model.bio.MiRNATarget> getMiRNAinteractions() { return miRNAinteractions; }
    public void setMiRNAinteractions(final java.util.Set<org.intermine.model.bio.MiRNATarget> miRNAinteractions) { this.miRNAinteractions = miRNAinteractions; }
    public void addMiRNAinteractions(final org.intermine.model.bio.MiRNATarget arg) { miRNAinteractions.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof MRNA && id != null) ? id.equals(((MRNA)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "MRNA [id=" + id + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("miRNAinteractions".equals(fieldName)) {
            return miRNAinteractions;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MRNA.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("miRNAinteractions".equals(fieldName)) {
            return miRNAinteractions;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MRNA.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("miRNAinteractions".equals(fieldName)) {
            miRNAinteractions = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.MRNA.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("miRNAinteractions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.MRNA.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.MRNA.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.MRNAShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.MRNA");
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.MRNAShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.MRNA)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        miRNAinteractions = new ProxyCollection<org.intermine.model.bio.MiRNATarget>(os, this, "miRNAinteractions", org.intermine.model.bio.MiRNATarget.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("miRNAinteractions".equals(fieldName)) {
            miRNAinteractions.add((org.intermine.model.bio.MiRNATarget) element);
        } else {
            if (!org.intermine.model.bio.MRNA.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("miRNAinteractions".equals(fieldName)) {
            return org.intermine.model.bio.MiRNATarget.class;
        }
        if (!org.intermine.model.bio.MRNA.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.MRNA.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
