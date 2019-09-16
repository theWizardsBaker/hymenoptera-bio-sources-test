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

public class SignallingDetailShadow implements SignallingDetail, ShadowClass
{
    public static final Class<SignallingDetail> shadowOf = SignallingDetail.class;
    // Attr: org.intermine.model.bio.SignallingDetail.effect
    protected java.lang.String effect;
    public java.lang.String getEffect() { return effect; }
    public void setEffect(final java.lang.String effect) { this.effect = effect; }

    // Attr: org.intermine.model.bio.SignallingDetail.mechanismSequences
    protected java.lang.String mechanismSequences;
    public java.lang.String getMechanismSequences() { return mechanismSequences; }
    public void setMechanismSequences(final java.lang.String mechanismSequences) { this.mechanismSequences = mechanismSequences; }

    // Attr: org.intermine.model.bio.SignallingDetail.effectMechanism
    protected java.lang.String effectMechanism;
    public java.lang.String getEffectMechanism() { return effectMechanism; }
    public void setEffectMechanism(final java.lang.String effectMechanism) { this.effectMechanism = effectMechanism; }

    // Attr: org.intermine.model.bio.SignallingDetail.notes
    protected java.lang.String notes;
    public java.lang.String getNotes() { return notes; }
    public void setNotes(final java.lang.String notes) { this.notes = notes; }

    // Attr: org.intermine.model.bio.SignallingDetail.mechanismResidues
    protected java.lang.String mechanismResidues;
    public java.lang.String getMechanismResidues() { return mechanismResidues; }
    public void setMechanismResidues(final java.lang.String mechanismResidues) { this.mechanismResidues = mechanismResidues; }

    // Ref: org.intermine.model.bio.SignallingDetail.signalling
    protected org.intermine.model.InterMineObject signalling;
    public org.intermine.model.bio.Signalling getSignalling() { if (signalling instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Signalling) ((org.intermine.objectstore.proxy.ProxyReference) signalling).getObject()); }; return (org.intermine.model.bio.Signalling) signalling; }
    public void setSignalling(final org.intermine.model.bio.Signalling signalling) { this.signalling = signalling; }
    public void proxySignalling(final org.intermine.objectstore.proxy.ProxyReference signalling) { this.signalling = signalling; }
    public org.intermine.model.InterMineObject proxGetSignalling() { return signalling; }

    // Col: org.intermine.model.bio.SignallingDetail.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof SignallingDetail && id != null) ? id.equals(((SignallingDetail)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "SignallingDetail [effect=" + (effect == null ? "null" : "\"" + effect + "\"") + ", effectMechanism=" + (effectMechanism == null ? "null" : "\"" + effectMechanism + "\"") + ", id=" + id + ", mechanismResidues=" + (mechanismResidues == null ? "null" : "\"" + mechanismResidues + "\"") + ", mechanismSequences=" + (mechanismSequences == null ? "null" : "\"" + mechanismSequences + "\"") + ", notes=" + (notes == null ? "null" : "\"" + notes + "\"") + ", signalling=" + (signalling == null ? "null" : (signalling.getId() == null ? "no id" : signalling.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("effect".equals(fieldName)) {
            return effect;
        }
        if ("mechanismSequences".equals(fieldName)) {
            return mechanismSequences;
        }
        if ("effectMechanism".equals(fieldName)) {
            return effectMechanism;
        }
        if ("notes".equals(fieldName)) {
            return notes;
        }
        if ("mechanismResidues".equals(fieldName)) {
            return mechanismResidues;
        }
        if ("signalling".equals(fieldName)) {
            if (signalling instanceof ProxyReference) {
                return ((ProxyReference) signalling).getObject();
            } else {
                return signalling;
            }
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SignallingDetail.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("effect".equals(fieldName)) {
            return effect;
        }
        if ("mechanismSequences".equals(fieldName)) {
            return mechanismSequences;
        }
        if ("effectMechanism".equals(fieldName)) {
            return effectMechanism;
        }
        if ("notes".equals(fieldName)) {
            return notes;
        }
        if ("mechanismResidues".equals(fieldName)) {
            return mechanismResidues;
        }
        if ("signalling".equals(fieldName)) {
            return signalling;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SignallingDetail.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("effect".equals(fieldName)) {
            effect = (java.lang.String) value;
        } else if ("mechanismSequences".equals(fieldName)) {
            mechanismSequences = (java.lang.String) value;
        } else if ("effectMechanism".equals(fieldName)) {
            effectMechanism = (java.lang.String) value;
        } else if ("notes".equals(fieldName)) {
            notes = (java.lang.String) value;
        } else if ("mechanismResidues".equals(fieldName)) {
            mechanismResidues = (java.lang.String) value;
        } else if ("signalling".equals(fieldName)) {
            signalling = (org.intermine.model.InterMineObject) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.SignallingDetail.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("effect".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("mechanismSequences".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("effectMechanism".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("notes".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("mechanismResidues".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("signalling".equals(fieldName)) {
            return org.intermine.model.bio.Signalling.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.SignallingDetail.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.SignallingDetail.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.SignallingDetailShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.SignallingDetail");
        if (effect != null) {
            sb.append("$_^aeffect$_^");
            String string = effect;
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
        if (mechanismSequences != null) {
            sb.append("$_^amechanismSequences$_^");
            String string = mechanismSequences;
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
        if (effectMechanism != null) {
            sb.append("$_^aeffectMechanism$_^");
            String string = effectMechanism;
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
        if (notes != null) {
            sb.append("$_^anotes$_^");
            String string = notes;
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
        if (mechanismResidues != null) {
            sb.append("$_^amechanismResidues$_^");
            String string = mechanismResidues;
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
        if (signalling != null) {
            sb.append("$_^rsignalling$_^").append(signalling.getId());
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
        if (!org.intermine.model.bio.SignallingDetailShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.SignallingDetail)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aeffect".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                effect = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amechanismSequences".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                mechanismSequences = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aeffectMechanism".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                effectMechanism = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "anotes".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                notes = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amechanismResidues".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                mechanismResidues = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rsignalling".equals(notXml[i])) {
                i++;
                signalling = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Signalling.class);
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
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.SignallingDetail.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.SignallingDetail.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.SignallingDetail.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
