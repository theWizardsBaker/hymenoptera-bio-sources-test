package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class xRefShadow implements xRef, ShadowClass
{
    public static final Class<xRef> shadowOf = xRef.class;
    // Attr: org.intermine.model.bio.xRef.source
    protected java.lang.String source;
    public java.lang.String getSource() { return source; }
    public void setSource(final java.lang.String source) { this.source = source; }

    // Attr: org.intermine.model.bio.xRef.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.xRef.refereeSource
    protected java.lang.String refereeSource;
    public java.lang.String getRefereeSource() { return refereeSource; }
    public void setRefereeSource(final java.lang.String refereeSource) { this.refereeSource = refereeSource; }

    // Ref: org.intermine.model.bio.xRef.referee
    protected org.intermine.model.InterMineObject referee;
    public org.intermine.model.bio.Gene getReferee() { if (referee instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) referee).getObject()); }; return (org.intermine.model.bio.Gene) referee; }
    public void setReferee(final org.intermine.model.bio.Gene referee) { this.referee = referee; }
    public void proxyReferee(final org.intermine.objectstore.proxy.ProxyReference referee) { this.referee = referee; }
    public org.intermine.model.InterMineObject proxGetReferee() { return referee; }

    // Ref: org.intermine.model.bio.xRef.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Ref: org.intermine.model.bio.xRef.referrer
    protected org.intermine.model.InterMineObject referrer;
    public org.intermine.model.bio.Gene getReferrer() { if (referrer instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) referrer).getObject()); }; return (org.intermine.model.bio.Gene) referrer; }
    public void setReferrer(final org.intermine.model.bio.Gene referrer) { this.referrer = referrer; }
    public void proxyReferrer(final org.intermine.objectstore.proxy.ProxyReference referrer) { this.referrer = referrer; }
    public org.intermine.model.InterMineObject proxGetReferrer() { return referrer; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof xRef && id != null) ? id.equals(((xRef)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "xRef [id=" + id + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", referee=" + (referee == null ? "null" : (referee.getId() == null ? "no id" : referee.getId().toString())) + ", refereeSource=" + (refereeSource == null ? "null" : "\"" + refereeSource + "\"") + ", referrer=" + (referrer == null ? "null" : (referrer.getId() == null ? "no id" : referrer.getId().toString())) + ", source=" + (source == null ? "null" : "\"" + source + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("refereeSource".equals(fieldName)) {
            return refereeSource;
        }
        if ("referee".equals(fieldName)) {
            if (referee instanceof ProxyReference) {
                return ((ProxyReference) referee).getObject();
            } else {
                return referee;
            }
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("referrer".equals(fieldName)) {
            if (referrer instanceof ProxyReference) {
                return ((ProxyReference) referrer).getObject();
            } else {
                return referrer;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.xRef.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("refereeSource".equals(fieldName)) {
            return refereeSource;
        }
        if ("referee".equals(fieldName)) {
            return referee;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("referrer".equals(fieldName)) {
            return referrer;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.xRef.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("source".equals(fieldName)) {
            source = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("refereeSource".equals(fieldName)) {
            refereeSource = (java.lang.String) value;
        } else if ("referee".equals(fieldName)) {
            referee = (org.intermine.model.InterMineObject) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("referrer".equals(fieldName)) {
            referrer = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.xRef.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("source".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("refereeSource".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("referee".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("referrer".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.xRef.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.xRef.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.xRefShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.xRef");
        if (source != null) {
            sb.append("$_^asource$_^");
            String string = source;
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
        if (refereeSource != null) {
            sb.append("$_^arefereeSource$_^");
            String string = refereeSource;
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
        if (referee != null) {
            sb.append("$_^rreferee$_^").append(referee.getId());
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
        }
        if (referrer != null) {
            sb.append("$_^rreferrer$_^").append(referrer.getId());
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
        if (!org.intermine.model.bio.xRefShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.xRef)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "asource".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                source = string == null ? notXml[i] : string.toString();
                i++;
            }
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
            if ((i < notXml.length) && "arefereeSource".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                refereeSource = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rreferee".equals(notXml[i])) {
                i++;
                referee = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
            if ((i < notXml.length) &&"rreferrer".equals(notXml[i])) {
                i++;
                referrer = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
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
            if (!org.intermine.model.bio.xRef.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.xRef.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.xRef.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
