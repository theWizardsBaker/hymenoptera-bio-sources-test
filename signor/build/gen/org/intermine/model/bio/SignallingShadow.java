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

public class SignallingShadow implements Signalling, ShadowClass
{
    public static final Class<Signalling> shadowOf = Signalling.class;
    // Attr: org.intermine.model.bio.Signalling.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Ref: org.intermine.model.bio.Signalling.participant2
    protected org.intermine.model.InterMineObject participant2;
    public org.intermine.model.bio.BioEntity getParticipant2() { if (participant2 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) participant2).getObject()); }; return (org.intermine.model.bio.BioEntity) participant2; }
    public void setParticipant2(final org.intermine.model.bio.BioEntity participant2) { this.participant2 = participant2; }
    public void proxyParticipant2(final org.intermine.objectstore.proxy.ProxyReference participant2) { this.participant2 = participant2; }
    public org.intermine.model.InterMineObject proxGetParticipant2() { return participant2; }

    // Ref: org.intermine.model.bio.Signalling.participant1
    protected org.intermine.model.InterMineObject participant1;
    public org.intermine.model.bio.BioEntity getParticipant1() { if (participant1 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) participant1).getObject()); }; return (org.intermine.model.bio.BioEntity) participant1; }
    public void setParticipant1(final org.intermine.model.bio.BioEntity participant1) { this.participant1 = participant1; }
    public void proxyParticipant1(final org.intermine.objectstore.proxy.ProxyReference participant1) { this.participant1 = participant1; }
    public org.intermine.model.InterMineObject proxGetParticipant1() { return participant1; }

    // Col: org.intermine.model.bio.Signalling.details
    protected java.util.Set<org.intermine.model.bio.SignallingDetail> details = new java.util.HashSet<org.intermine.model.bio.SignallingDetail>();
    public java.util.Set<org.intermine.model.bio.SignallingDetail> getDetails() { return details; }
    public void setDetails(final java.util.Set<org.intermine.model.bio.SignallingDetail> details) { this.details = details; }
    public void addDetails(final org.intermine.model.bio.SignallingDetail arg) { details.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Signalling && id != null) ? id.equals(((Signalling)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Signalling [id=" + id + ", identifier=" + (identifier == null ? "null" : "\"" + identifier + "\"") + ", participant1=" + (participant1 == null ? "null" : (participant1.getId() == null ? "no id" : participant1.getId().toString())) + ", participant2=" + (participant2 == null ? "null" : (participant2.getId() == null ? "no id" : participant2.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("participant2".equals(fieldName)) {
            if (participant2 instanceof ProxyReference) {
                return ((ProxyReference) participant2).getObject();
            } else {
                return participant2;
            }
        }
        if ("participant1".equals(fieldName)) {
            if (participant1 instanceof ProxyReference) {
                return ((ProxyReference) participant1).getObject();
            } else {
                return participant1;
            }
        }
        if ("details".equals(fieldName)) {
            return details;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Signalling.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("participant2".equals(fieldName)) {
            return participant2;
        }
        if ("participant1".equals(fieldName)) {
            return participant1;
        }
        if ("details".equals(fieldName)) {
            return details;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Signalling.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("participant2".equals(fieldName)) {
            participant2 = (org.intermine.model.InterMineObject) value;
        } else if ("participant1".equals(fieldName)) {
            participant1 = (org.intermine.model.InterMineObject) value;
        } else if ("details".equals(fieldName)) {
            details = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Signalling.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("participant2".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("participant1".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("details".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Signalling.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Signalling.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.SignallingShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Signalling");
        if (identifier != null) {
            sb.append("$_^aidentifier$_^");
            String string = identifier;
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
        if (participant2 != null) {
            sb.append("$_^rparticipant2$_^").append(participant2.getId());
        }
        if (participant1 != null) {
            sb.append("$_^rparticipant1$_^").append(participant1.getId());
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
        if (!org.intermine.model.bio.SignallingShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Signalling)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aidentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                identifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rparticipant2".equals(notXml[i])) {
                i++;
                participant2 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
                i++;
            };
            if ((i < notXml.length) &&"rparticipant1".equals(notXml[i])) {
                i++;
                participant1 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
        details = new ProxyCollection<org.intermine.model.bio.SignallingDetail>(os, this, "details", org.intermine.model.bio.SignallingDetail.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("details".equals(fieldName)) {
            details.add((org.intermine.model.bio.SignallingDetail) element);
        } else {
            if (!org.intermine.model.bio.Signalling.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("details".equals(fieldName)) {
            return org.intermine.model.bio.SignallingDetail.class;
        }
        if (!org.intermine.model.bio.Signalling.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Signalling.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
