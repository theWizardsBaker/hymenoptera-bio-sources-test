package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class TransposableElementInsertionSiteShadow implements TransposableElementInsertionSite, ShadowClass
{
    public static final Class<TransposableElementInsertionSite> shadowOf = TransposableElementInsertionSite.class;
    // Attr: org.intermine.model.bio.TransposableElementInsertionSite.subType
    protected java.lang.String subType;
    public java.lang.String getSubType() { return subType; }
    public void setSubType(final java.lang.String subType) { this.subType = subType; }

    // Attr: org.intermine.model.bio.TransposableElementInsertionSite.available
    protected java.lang.Boolean available;
    public java.lang.Boolean getAvailable() { return available; }
    public void setAvailable(final java.lang.Boolean available) { this.available = available; }

    // Attr: org.intermine.model.bio.TransposableElementInsertionSite.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof TransposableElementInsertionSite && id != null) ? id.equals(((TransposableElementInsertionSite)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "TransposableElementInsertionSite [available=" + (available == null ? "null" : "\"" + available + "\"") + ", id=" + id + ", subType=" + (subType == null ? "null" : "\"" + subType + "\"") + ", type=" + (type == null ? "null" : "\"" + type + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("subType".equals(fieldName)) {
            return subType;
        }
        if ("available".equals(fieldName)) {
            return available;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.TransposableElementInsertionSite.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("subType".equals(fieldName)) {
            return subType;
        }
        if ("available".equals(fieldName)) {
            return available;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.TransposableElementInsertionSite.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("subType".equals(fieldName)) {
            subType = (java.lang.String) value;
        } else if ("available".equals(fieldName)) {
            available = (java.lang.Boolean) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.TransposableElementInsertionSite.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("subType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("available".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.TransposableElementInsertionSite.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.TransposableElementInsertionSite.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.TransposableElementInsertionSiteShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.TransposableElementInsertionSite");
        if (subType != null) {
            sb.append("$_^asubType$_^");
            String string = subType;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (available != null) {
            sb.append("$_^aavailable$_^").append(available);
        }
        if (type != null) {
            sb.append("$_^atype$_^");
            String string = type;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
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
        if (!org.intermine.model.bio.TransposableElementInsertionSiteShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.TransposableElementInsertionSite)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "asubType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                subType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aavailable".equals(notXml[i])) {
                i++;
                available = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "atype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                type = string == null ? notXml[i] : string.toString();
                i++;
            }
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
            if (!org.intermine.model.bio.TransposableElementInsertionSite.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.TransposableElementInsertionSite.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.TransposableElementInsertionSite.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
