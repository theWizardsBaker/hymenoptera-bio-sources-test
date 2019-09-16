package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ChromosomalDeletionShadow implements ChromosomalDeletion, ShadowClass
{
    public static final Class<ChromosomalDeletion> shadowOf = ChromosomalDeletion.class;
    // Attr: org.intermine.model.bio.ChromosomalDeletion.available
    protected java.lang.Boolean available;
    public java.lang.Boolean getAvailable() { return available; }
    public void setAvailable(final java.lang.Boolean available) { this.available = available; }

    // Attr: org.intermine.model.bio.ChromosomalDeletion.confirmedByGenetics
    protected java.lang.Boolean confirmedByGenetics;
    public java.lang.Boolean getConfirmedByGenetics() { return confirmedByGenetics; }
    public void setConfirmedByGenetics(final java.lang.Boolean confirmedByGenetics) { this.confirmedByGenetics = confirmedByGenetics; }

    // Attr: org.intermine.model.bio.ChromosomalDeletion.confirmedByPCR
    protected java.lang.Boolean confirmedByPCR;
    public java.lang.Boolean getConfirmedByPCR() { return confirmedByPCR; }
    public void setConfirmedByPCR(final java.lang.Boolean confirmedByPCR) { this.confirmedByPCR = confirmedByPCR; }

    // Ref: org.intermine.model.bio.ChromosomalDeletion.element2
    protected org.intermine.model.InterMineObject element2;
    public org.intermine.model.bio.TransposableElementInsertionSite getElement2() { if (element2 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.TransposableElementInsertionSite) ((org.intermine.objectstore.proxy.ProxyReference) element2).getObject()); }; return (org.intermine.model.bio.TransposableElementInsertionSite) element2; }
    public void setElement2(final org.intermine.model.bio.TransposableElementInsertionSite element2) { this.element2 = element2; }
    public void proxyElement2(final org.intermine.objectstore.proxy.ProxyReference element2) { this.element2 = element2; }
    public org.intermine.model.InterMineObject proxGetElement2() { return element2; }

    // Ref: org.intermine.model.bio.ChromosomalDeletion.element1
    protected org.intermine.model.InterMineObject element1;
    public org.intermine.model.bio.TransposableElementInsertionSite getElement1() { if (element1 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.TransposableElementInsertionSite) ((org.intermine.objectstore.proxy.ProxyReference) element1).getObject()); }; return (org.intermine.model.bio.TransposableElementInsertionSite) element1; }
    public void setElement1(final org.intermine.model.bio.TransposableElementInsertionSite element1) { this.element1 = element1; }
    public void proxyElement1(final org.intermine.objectstore.proxy.ProxyReference element1) { this.element1 = element1; }
    public org.intermine.model.InterMineObject proxGetElement1() { return element1; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ChromosomalDeletion && id != null) ? id.equals(((ChromosomalDeletion)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ChromosomalDeletion [available=" + (available == null ? "null" : "\"" + available + "\"") + ", confirmedByGenetics=" + (confirmedByGenetics == null ? "null" : "\"" + confirmedByGenetics + "\"") + ", confirmedByPCR=" + (confirmedByPCR == null ? "null" : "\"" + confirmedByPCR + "\"") + ", element1=" + (element1 == null ? "null" : (element1.getId() == null ? "no id" : element1.getId().toString())) + ", element2=" + (element2 == null ? "null" : (element2.getId() == null ? "no id" : element2.getId().toString())) + ", id=" + id + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("available".equals(fieldName)) {
            return available;
        }
        if ("confirmedByGenetics".equals(fieldName)) {
            return confirmedByGenetics;
        }
        if ("confirmedByPCR".equals(fieldName)) {
            return confirmedByPCR;
        }
        if ("element2".equals(fieldName)) {
            if (element2 instanceof ProxyReference) {
                return ((ProxyReference) element2).getObject();
            } else {
                return element2;
            }
        }
        if ("element1".equals(fieldName)) {
            if (element1 instanceof ProxyReference) {
                return ((ProxyReference) element1).getObject();
            } else {
                return element1;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ChromosomalDeletion.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("available".equals(fieldName)) {
            return available;
        }
        if ("confirmedByGenetics".equals(fieldName)) {
            return confirmedByGenetics;
        }
        if ("confirmedByPCR".equals(fieldName)) {
            return confirmedByPCR;
        }
        if ("element2".equals(fieldName)) {
            return element2;
        }
        if ("element1".equals(fieldName)) {
            return element1;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ChromosomalDeletion.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("available".equals(fieldName)) {
            available = (java.lang.Boolean) value;
        } else if ("confirmedByGenetics".equals(fieldName)) {
            confirmedByGenetics = (java.lang.Boolean) value;
        } else if ("confirmedByPCR".equals(fieldName)) {
            confirmedByPCR = (java.lang.Boolean) value;
        } else if ("element2".equals(fieldName)) {
            element2 = (org.intermine.model.InterMineObject) value;
        } else if ("element1".equals(fieldName)) {
            element1 = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ChromosomalDeletion.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("available".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("confirmedByGenetics".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("confirmedByPCR".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("element2".equals(fieldName)) {
            return org.intermine.model.bio.TransposableElementInsertionSite.class;
        }
        if ("element1".equals(fieldName)) {
            return org.intermine.model.bio.TransposableElementInsertionSite.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ChromosomalDeletion.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ChromosomalDeletion.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ChromosomalDeletionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ChromosomalDeletion");
        if (available != null) {
            sb.append("$_^aavailable$_^").append(available);
        }
        if (confirmedByGenetics != null) {
            sb.append("$_^aconfirmedByGenetics$_^").append(confirmedByGenetics);
        }
        if (confirmedByPCR != null) {
            sb.append("$_^aconfirmedByPCR$_^").append(confirmedByPCR);
        }
        if (element2 != null) {
            sb.append("$_^relement2$_^").append(element2.getId());
        }
        if (element1 != null) {
            sb.append("$_^relement1$_^").append(element1.getId());
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
        if (!org.intermine.model.bio.ChromosomalDeletionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ChromosomalDeletion)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aavailable".equals(notXml[i])) {
                i++;
                available = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aconfirmedByGenetics".equals(notXml[i])) {
                i++;
                confirmedByGenetics = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aconfirmedByPCR".equals(notXml[i])) {
                i++;
                confirmedByPCR = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"relement2".equals(notXml[i])) {
                i++;
                element2 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.TransposableElementInsertionSite.class);
                i++;
            };
            if ((i < notXml.length) &&"relement1".equals(notXml[i])) {
                i++;
                element1 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.TransposableElementInsertionSite.class);
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
            if (!org.intermine.model.bio.ChromosomalDeletion.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.ChromosomalDeletion.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ChromosomalDeletion.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
