package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class NetworkPropertyShadow implements NetworkProperty, ShadowClass
{
    public static final Class<NetworkProperty> shadowOf = NetworkProperty.class;
    // Attr: org.intermine.model.bio.NetworkProperty.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.bio.NetworkProperty.value
    protected java.lang.String value;
    public java.lang.String getValue() { return value; }
    public void setValue(final java.lang.String value) { this.value = value; }

    // Ref: org.intermine.model.bio.NetworkProperty.node
    protected org.intermine.model.InterMineObject node;
    public org.intermine.model.bio.BioEntity getNode() { if (node instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) node).getObject()); }; return (org.intermine.model.bio.BioEntity) node; }
    public void setNode(final org.intermine.model.bio.BioEntity node) { this.node = node; }
    public void proxyNode(final org.intermine.objectstore.proxy.ProxyReference node) { this.node = node; }
    public org.intermine.model.InterMineObject proxGetNode() { return node; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof NetworkProperty && id != null) ? id.equals(((NetworkProperty)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "NetworkProperty [id=" + id + ", node=" + (node == null ? "null" : (node.getId() == null ? "no id" : node.getId().toString())) + ", type=" + (type == null ? "null" : "\"" + type + "\"") + ", value=" + (value == null ? "null" : "\"" + value + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("node".equals(fieldName)) {
            if (node instanceof ProxyReference) {
                return ((ProxyReference) node).getObject();
            } else {
                return node;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.NetworkProperty.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("value".equals(fieldName)) {
            return value;
        }
        if ("node".equals(fieldName)) {
            return node;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.NetworkProperty.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("value".equals(fieldName)) {
            this.value = (java.lang.String) value;
        } else if ("node".equals(fieldName)) {
            node = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.NetworkProperty.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("value".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("node".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.NetworkProperty.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.NetworkProperty.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.NetworkPropertyShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.NetworkProperty");
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
        if (value != null) {
            sb.append("$_^avalue$_^");
            String string = value;
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
        if (node != null) {
            sb.append("$_^rnode$_^").append(node.getId());
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
        if (!org.intermine.model.bio.NetworkPropertyShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.NetworkProperty)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
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
            if ((i < notXml.length) && "avalue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                value = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rnode".equals(notXml[i])) {
                i++;
                node = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
            if (!org.intermine.model.bio.NetworkProperty.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.NetworkProperty.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.NetworkProperty.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
