package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class RegulationShadow implements Regulation, ShadowClass
{
    public static final Class<Regulation> shadowOf = Regulation.class;
    // Attr: org.intermine.model.bio.Regulation.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Ref: org.intermine.model.bio.Regulation.target
    protected org.intermine.model.InterMineObject target;
    public org.intermine.model.bio.BioEntity getTarget() { if (target instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) target).getObject()); }; return (org.intermine.model.bio.BioEntity) target; }
    public void setTarget(final org.intermine.model.bio.BioEntity target) { this.target = target; }
    public void proxyTarget(final org.intermine.objectstore.proxy.ProxyReference target) { this.target = target; }
    public org.intermine.model.InterMineObject proxGetTarget() { return target; }

    // Ref: org.intermine.model.bio.Regulation.source
    protected org.intermine.model.InterMineObject source;
    public org.intermine.model.bio.BioEntity getSource() { if (source instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) source).getObject()); }; return (org.intermine.model.bio.BioEntity) source; }
    public void setSource(final org.intermine.model.bio.BioEntity source) { this.source = source; }
    public void proxySource(final org.intermine.objectstore.proxy.ProxyReference source) { this.source = source; }
    public org.intermine.model.InterMineObject proxGetSource() { return source; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Regulation && id != null) ? id.equals(((Regulation)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Regulation [id=" + id + ", source=" + (source == null ? "null" : (source.getId() == null ? "no id" : source.getId().toString())) + ", target=" + (target == null ? "null" : (target.getId() == null ? "no id" : target.getId().toString())) + ", type=" + (type == null ? "null" : "\"" + type + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("target".equals(fieldName)) {
            if (target instanceof ProxyReference) {
                return ((ProxyReference) target).getObject();
            } else {
                return target;
            }
        }
        if ("source".equals(fieldName)) {
            if (source instanceof ProxyReference) {
                return ((ProxyReference) source).getObject();
            } else {
                return source;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Regulation.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("target".equals(fieldName)) {
            return target;
        }
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Regulation.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("target".equals(fieldName)) {
            target = (org.intermine.model.InterMineObject) value;
        } else if ("source".equals(fieldName)) {
            source = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Regulation.class.equals(getClass())) {
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
        if ("target".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("source".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Regulation.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Regulation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.RegulationShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Regulation");
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
        if (target != null) {
            sb.append("$_^rtarget$_^").append(target.getId());
        }
        if (source != null) {
            sb.append("$_^rsource$_^").append(source.getId());
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
        if (!org.intermine.model.bio.RegulationShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Regulation)");
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
            if ((i < notXml.length) &&"rtarget".equals(notXml[i])) {
                i++;
                target = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
                i++;
            };
            if ((i < notXml.length) &&"rsource".equals(notXml[i])) {
                i++;
                source = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
            if (!org.intermine.model.bio.Regulation.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.Regulation.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Regulation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
