package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ExpressionMetadataShadow implements ExpressionMetadata, ShadowClass
{
    public static final Class<ExpressionMetadata> shadowOf = ExpressionMetadata.class;
    // Col: org.intermine.model.bio.ExpressionMetadata.isoforms
    protected java.util.Set<org.intermine.model.bio.Expression> isoforms = new java.util.HashSet<org.intermine.model.bio.Expression>();
    public java.util.Set<org.intermine.model.bio.Expression> getIsoforms() { return isoforms; }
    public void setIsoforms(final java.util.Set<org.intermine.model.bio.Expression> isoforms) { this.isoforms = isoforms; }
    public void addIsoforms(final org.intermine.model.bio.Expression arg) { isoforms.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ExpressionMetadata && id != null) ? id.equals(((ExpressionMetadata)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ExpressionMetadata [id=" + id + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("isoforms".equals(fieldName)) {
            return isoforms;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("isoforms".equals(fieldName)) {
            return isoforms;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("isoforms".equals(fieldName)) {
            isoforms = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("isoforms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExpressionMetadata.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionMetadataShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExpressionMetadata");
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.ExpressionMetadataShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExpressionMetadata)");
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
        isoforms = new ProxyCollection<org.intermine.model.bio.Expression>(os, this, "isoforms", org.intermine.model.bio.Expression.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("isoforms".equals(fieldName)) {
            isoforms.add((org.intermine.model.bio.Expression) element);
        } else {
            if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("isoforms".equals(fieldName)) {
            return org.intermine.model.bio.Expression.class;
        }
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExpressionMetadata.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
