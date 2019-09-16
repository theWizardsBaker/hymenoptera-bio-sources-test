package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class MicroarrayOligoShadow implements MicroarrayOligo, ShadowClass
{
    public static final Class<MicroarrayOligo> shadowOf = MicroarrayOligo.class;
    // Attr: org.intermine.model.bio.MicroarrayOligo.tm
    protected java.lang.Float tm;
    public java.lang.Float getTm() { return tm; }
    public void setTm(final java.lang.Float tm) { this.tm = tm; }

    // Ref: org.intermine.model.bio.MicroarrayOligo.transcript
    protected org.intermine.model.InterMineObject transcript;
    public org.intermine.model.bio.Transcript getTranscript() { if (transcript instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Transcript) ((org.intermine.objectstore.proxy.ProxyReference) transcript).getObject()); }; return (org.intermine.model.bio.Transcript) transcript; }
    public void setTranscript(final org.intermine.model.bio.Transcript transcript) { this.transcript = transcript; }
    public void proxyTranscript(final org.intermine.objectstore.proxy.ProxyReference transcript) { this.transcript = transcript; }
    public org.intermine.model.InterMineObject proxGetTranscript() { return transcript; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof MicroarrayOligo && id != null) ? id.equals(((MicroarrayOligo)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "MicroarrayOligo [id=" + id + ", tm=" + tm + ", transcript=" + (transcript == null ? "null" : (transcript.getId() == null ? "no id" : transcript.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("tm".equals(fieldName)) {
            return tm;
        }
        if ("transcript".equals(fieldName)) {
            if (transcript instanceof ProxyReference) {
                return ((ProxyReference) transcript).getObject();
            } else {
                return transcript;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MicroarrayOligo.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("tm".equals(fieldName)) {
            return tm;
        }
        if ("transcript".equals(fieldName)) {
            return transcript;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MicroarrayOligo.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("tm".equals(fieldName)) {
            tm = (java.lang.Float) value;
        } else if ("transcript".equals(fieldName)) {
            transcript = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.MicroarrayOligo.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("tm".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("transcript".equals(fieldName)) {
            return org.intermine.model.bio.Transcript.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.MicroarrayOligo.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.MicroarrayOligo.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.MicroarrayOligoShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.MicroarrayOligo");
        if (tm != null) {
            sb.append("$_^atm$_^").append(tm);
        }
        if (transcript != null) {
            sb.append("$_^rtranscript$_^").append(transcript.getId());
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
        if (!org.intermine.model.bio.MicroarrayOligoShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.MicroarrayOligo)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "atm".equals(notXml[i])) {
                i++;
                tm = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rtranscript".equals(notXml[i])) {
                i++;
                transcript = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Transcript.class);
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
            if (!org.intermine.model.bio.MicroarrayOligo.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.MicroarrayOligo.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.MicroarrayOligo.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
