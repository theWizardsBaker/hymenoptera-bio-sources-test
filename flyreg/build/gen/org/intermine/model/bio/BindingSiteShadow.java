package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class BindingSiteShadow implements BindingSite, ShadowClass
{
    public static final Class<BindingSite> shadowOf = BindingSite.class;
    // Ref: org.intermine.model.bio.BindingSite.factor
    protected org.intermine.model.InterMineObject factor;
    public org.intermine.model.bio.Gene getFactor() { if (factor instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) factor).getObject()); }; return (org.intermine.model.bio.Gene) factor; }
    public void setFactor(final org.intermine.model.bio.Gene factor) { this.factor = factor; }
    public void proxyFactor(final org.intermine.objectstore.proxy.ProxyReference factor) { this.factor = factor; }
    public org.intermine.model.InterMineObject proxGetFactor() { return factor; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof BindingSite && id != null) ? id.equals(((BindingSite)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "BindingSite [factor=" + (factor == null ? "null" : (factor.getId() == null ? "no id" : factor.getId().toString())) + ", id=" + id + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("factor".equals(fieldName)) {
            if (factor instanceof ProxyReference) {
                return ((ProxyReference) factor).getObject();
            } else {
                return factor;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.BindingSite.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("factor".equals(fieldName)) {
            return factor;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.BindingSite.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("factor".equals(fieldName)) {
            factor = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.BindingSite.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("factor".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.BindingSite.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.BindingSite.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.BindingSiteShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.BindingSite");
        if (factor != null) {
            sb.append("$_^rfactor$_^").append(factor.getId());
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.BindingSiteShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.BindingSite)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) &&"rfactor".equals(notXml[i])) {
                i++;
                factor = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.BindingSite.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.BindingSite.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.BindingSite.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
