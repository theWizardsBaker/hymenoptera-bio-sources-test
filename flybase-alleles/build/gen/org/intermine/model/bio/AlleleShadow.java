package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class AlleleShadow implements Allele, ShadowClass
{
    public static final Class<Allele> shadowOf = Allele.class;
    // Col: org.intermine.model.bio.Allele.doAnnotation
    protected java.util.Set<org.intermine.model.bio.DOAnnotation> doAnnotation = new java.util.HashSet<org.intermine.model.bio.DOAnnotation>();
    public java.util.Set<org.intermine.model.bio.DOAnnotation> getDoAnnotation() { return doAnnotation; }
    public void setDoAnnotation(final java.util.Set<org.intermine.model.bio.DOAnnotation> doAnnotation) { this.doAnnotation = doAnnotation; }
    public void addDoAnnotation(final org.intermine.model.bio.DOAnnotation arg) { doAnnotation.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Allele && id != null) ? id.equals(((Allele)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Allele [id=" + id + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("doAnnotation".equals(fieldName)) {
            return doAnnotation;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Allele.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("doAnnotation".equals(fieldName)) {
            return doAnnotation;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Allele.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("doAnnotation".equals(fieldName)) {
            doAnnotation = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Allele.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("doAnnotation".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Allele.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Allele.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.AlleleShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Allele");
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.AlleleShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Allele)");
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
        doAnnotation = new ProxyCollection<org.intermine.model.bio.DOAnnotation>(os, this, "doAnnotation", org.intermine.model.bio.DOAnnotation.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("doAnnotation".equals(fieldName)) {
            doAnnotation.add((org.intermine.model.bio.DOAnnotation) element);
        } else {
            if (!org.intermine.model.bio.Allele.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("doAnnotation".equals(fieldName)) {
            return org.intermine.model.bio.DOAnnotation.class;
        }
        if (!org.intermine.model.bio.Allele.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Allele.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
