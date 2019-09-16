package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class TissueShadow implements Tissue, ShadowClass
{
    public static final Class<Tissue> shadowOf = Tissue.class;
    // Attr: org.intermine.model.bio.Tissue.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Ref: org.intermine.model.bio.Tissue.tissueGroup
    protected org.intermine.model.InterMineObject tissueGroup;
    public org.intermine.model.bio.TissueGroup getTissueGroup() { if (tissueGroup instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.TissueGroup) ((org.intermine.objectstore.proxy.ProxyReference) tissueGroup).getObject()); }; return (org.intermine.model.bio.TissueGroup) tissueGroup; }
    public void setTissueGroup(final org.intermine.model.bio.TissueGroup tissueGroup) { this.tissueGroup = tissueGroup; }
    public void proxyTissueGroup(final org.intermine.objectstore.proxy.ProxyReference tissueGroup) { this.tissueGroup = tissueGroup; }
    public org.intermine.model.InterMineObject proxGetTissueGroup() { return tissueGroup; }

    // Col: org.intermine.model.bio.Tissue.proteinAtlasExpression
    protected java.util.Set<org.intermine.model.bio.ProteinAtlasExpression> proteinAtlasExpression = new java.util.HashSet<org.intermine.model.bio.ProteinAtlasExpression>();
    public java.util.Set<org.intermine.model.bio.ProteinAtlasExpression> getProteinAtlasExpression() { return proteinAtlasExpression; }
    public void setProteinAtlasExpression(final java.util.Set<org.intermine.model.bio.ProteinAtlasExpression> proteinAtlasExpression) { this.proteinAtlasExpression = proteinAtlasExpression; }
    public void addProteinAtlasExpression(final org.intermine.model.bio.ProteinAtlasExpression arg) { proteinAtlasExpression.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Tissue && id != null) ? id.equals(((Tissue)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Tissue [id=" + id + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", tissueGroup=" + (tissueGroup == null ? "null" : (tissueGroup.getId() == null ? "no id" : tissueGroup.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("tissueGroup".equals(fieldName)) {
            if (tissueGroup instanceof ProxyReference) {
                return ((ProxyReference) tissueGroup).getObject();
            } else {
                return tissueGroup;
            }
        }
        if ("proteinAtlasExpression".equals(fieldName)) {
            return proteinAtlasExpression;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Tissue.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("tissueGroup".equals(fieldName)) {
            return tissueGroup;
        }
        if ("proteinAtlasExpression".equals(fieldName)) {
            return proteinAtlasExpression;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Tissue.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("tissueGroup".equals(fieldName)) {
            tissueGroup = (org.intermine.model.InterMineObject) value;
        } else if ("proteinAtlasExpression".equals(fieldName)) {
            proteinAtlasExpression = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Tissue.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("tissueGroup".equals(fieldName)) {
            return org.intermine.model.bio.TissueGroup.class;
        }
        if ("proteinAtlasExpression".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Tissue.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Tissue.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.TissueShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Tissue");
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
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
        if (tissueGroup != null) {
            sb.append("$_^rtissueGroup$_^").append(tissueGroup.getId());
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
        if (!org.intermine.model.bio.TissueShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Tissue)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rtissueGroup".equals(notXml[i])) {
                i++;
                tissueGroup = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.TissueGroup.class);
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
        proteinAtlasExpression = new ProxyCollection<org.intermine.model.bio.ProteinAtlasExpression>(os, this, "proteinAtlasExpression", org.intermine.model.bio.ProteinAtlasExpression.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("proteinAtlasExpression".equals(fieldName)) {
            proteinAtlasExpression.add((org.intermine.model.bio.ProteinAtlasExpression) element);
        } else {
            if (!org.intermine.model.bio.Tissue.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("proteinAtlasExpression".equals(fieldName)) {
            return org.intermine.model.bio.ProteinAtlasExpression.class;
        }
        if (!org.intermine.model.bio.Tissue.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Tissue.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
