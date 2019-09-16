package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ExpressionShadow implements Expression, ShadowClass
{
    public static final Class<Expression> shadowOf = Expression.class;
    // Attr: org.intermine.model.bio.Expression.normalizedCounts
    protected java.lang.Float normalizedCounts;
    public java.lang.Float getNormalizedCounts() { return normalizedCounts; }
    public void setNormalizedCounts(final java.lang.Float normalizedCounts) { this.normalizedCounts = normalizedCounts; }

    // Attr: org.intermine.model.bio.Expression.sampleName
    protected java.lang.String sampleName;
    public java.lang.String getSampleName() { return sampleName; }
    public void setSampleName(final java.lang.String sampleName) { this.sampleName = sampleName; }

    // Attr: org.intermine.model.bio.Expression.rawCounts
    protected java.lang.Integer rawCounts;
    public java.lang.Integer getRawCounts() { return rawCounts; }
    public void setRawCounts(final java.lang.Integer rawCounts) { this.rawCounts = rawCounts; }

    // Attr: org.intermine.model.bio.Expression.rpkm
    protected java.lang.Float rpkm;
    public java.lang.Float getRpkm() { return rpkm; }
    public void setRpkm(final java.lang.Float rpkm) { this.rpkm = rpkm; }

    // Attr: org.intermine.model.bio.Expression.fpkm
    protected java.lang.Float fpkm;
    public java.lang.Float getFpkm() { return fpkm; }
    public void setFpkm(final java.lang.Float fpkm) { this.fpkm = fpkm; }

    // Ref: org.intermine.model.bio.Expression.sampleMetadata
    protected org.intermine.model.InterMineObject sampleMetadata;
    public org.intermine.model.bio.ExpressionMetadata getSampleMetadata() { if (sampleMetadata instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ExpressionMetadata) ((org.intermine.objectstore.proxy.ProxyReference) sampleMetadata).getObject()); }; return (org.intermine.model.bio.ExpressionMetadata) sampleMetadata; }
    public void setSampleMetadata(final org.intermine.model.bio.ExpressionMetadata sampleMetadata) { this.sampleMetadata = sampleMetadata; }
    public void proxySampleMetadata(final org.intermine.objectstore.proxy.ProxyReference sampleMetadata) { this.sampleMetadata = sampleMetadata; }
    public org.intermine.model.InterMineObject proxGetSampleMetadata() { return sampleMetadata; }

    // Ref: org.intermine.model.bio.Expression.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Ref: org.intermine.model.bio.Expression.isoform
    protected org.intermine.model.InterMineObject isoform;
    public org.intermine.model.bio.Transcript getIsoform() { if (isoform instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Transcript) ((org.intermine.objectstore.proxy.ProxyReference) isoform).getObject()); }; return (org.intermine.model.bio.Transcript) isoform; }
    public void setIsoform(final org.intermine.model.bio.Transcript isoform) { this.isoform = isoform; }
    public void proxyIsoform(final org.intermine.objectstore.proxy.ProxyReference isoform) { this.isoform = isoform; }
    public org.intermine.model.InterMineObject proxGetIsoform() { return isoform; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Expression && id != null) ? id.equals(((Expression)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Expression [fpkm=" + fpkm + ", id=" + id + ", isoform=" + (isoform == null ? "null" : (isoform.getId() == null ? "no id" : isoform.getId().toString())) + ", normalizedCounts=" + normalizedCounts + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", rawCounts=" + rawCounts + ", rpkm=" + rpkm + ", sampleMetadata=" + (sampleMetadata == null ? "null" : (sampleMetadata.getId() == null ? "no id" : sampleMetadata.getId().toString())) + ", sampleName=" + (sampleName == null ? "null" : "\"" + sampleName + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("normalizedCounts".equals(fieldName)) {
            return normalizedCounts;
        }
        if ("sampleName".equals(fieldName)) {
            return sampleName;
        }
        if ("rawCounts".equals(fieldName)) {
            return rawCounts;
        }
        if ("rpkm".equals(fieldName)) {
            return rpkm;
        }
        if ("fpkm".equals(fieldName)) {
            return fpkm;
        }
        if ("sampleMetadata".equals(fieldName)) {
            if (sampleMetadata instanceof ProxyReference) {
                return ((ProxyReference) sampleMetadata).getObject();
            } else {
                return sampleMetadata;
            }
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("isoform".equals(fieldName)) {
            if (isoform instanceof ProxyReference) {
                return ((ProxyReference) isoform).getObject();
            } else {
                return isoform;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("normalizedCounts".equals(fieldName)) {
            return normalizedCounts;
        }
        if ("sampleName".equals(fieldName)) {
            return sampleName;
        }
        if ("rawCounts".equals(fieldName)) {
            return rawCounts;
        }
        if ("rpkm".equals(fieldName)) {
            return rpkm;
        }
        if ("fpkm".equals(fieldName)) {
            return fpkm;
        }
        if ("sampleMetadata".equals(fieldName)) {
            return sampleMetadata;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("isoform".equals(fieldName)) {
            return isoform;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("normalizedCounts".equals(fieldName)) {
            normalizedCounts = (java.lang.Float) value;
        } else if ("sampleName".equals(fieldName)) {
            sampleName = (java.lang.String) value;
        } else if ("rawCounts".equals(fieldName)) {
            rawCounts = (java.lang.Integer) value;
        } else if ("rpkm".equals(fieldName)) {
            rpkm = (java.lang.Float) value;
        } else if ("fpkm".equals(fieldName)) {
            fpkm = (java.lang.Float) value;
        } else if ("sampleMetadata".equals(fieldName)) {
            sampleMetadata = (org.intermine.model.InterMineObject) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("isoform".equals(fieldName)) {
            isoform = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("normalizedCounts".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("sampleName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("rawCounts".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("rpkm".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("fpkm".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("sampleMetadata".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionMetadata.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("isoform".equals(fieldName)) {
            return org.intermine.model.bio.Transcript.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Expression.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Expression");
        if (normalizedCounts != null) {
            sb.append("$_^anormalizedCounts$_^").append(normalizedCounts);
        }
        if (sampleName != null) {
            sb.append("$_^asampleName$_^");
            String string = sampleName;
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
        if (rawCounts != null) {
            sb.append("$_^arawCounts$_^").append(rawCounts);
        }
        if (rpkm != null) {
            sb.append("$_^arpkm$_^").append(rpkm);
        }
        if (fpkm != null) {
            sb.append("$_^afpkm$_^").append(fpkm);
        }
        if (sampleMetadata != null) {
            sb.append("$_^rsampleMetadata$_^").append(sampleMetadata.getId());
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
        }
        if (isoform != null) {
            sb.append("$_^risoform$_^").append(isoform.getId());
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
        if (!org.intermine.model.bio.ExpressionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Expression)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "anormalizedCounts".equals(notXml[i])) {
                i++;
                normalizedCounts = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "asampleName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sampleName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "arawCounts".equals(notXml[i])) {
                i++;
                rawCounts = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "arpkm".equals(notXml[i])) {
                i++;
                rpkm = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "afpkm".equals(notXml[i])) {
                i++;
                fpkm = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rsampleMetadata".equals(notXml[i])) {
                i++;
                sampleMetadata = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ExpressionMetadata.class);
                i++;
            };
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
            if ((i < notXml.length) &&"risoform".equals(notXml[i])) {
                i++;
                isoform = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Transcript.class);
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
            if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.Expression.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Expression.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
