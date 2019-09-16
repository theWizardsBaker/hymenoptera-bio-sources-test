package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class RNASeqResultShadow implements RNASeqResult, ShadowClass
{
    public static final Class<RNASeqResult> shadowOf = RNASeqResult.class;
    // Attr: org.intermine.model.bio.RNASeqResult.expressionScore
    protected java.lang.Double expressionScore;
    public java.lang.Double getExpressionScore() { return expressionScore; }
    public void setExpressionScore(final java.lang.Double expressionScore) { this.expressionScore = expressionScore; }

    // Attr: org.intermine.model.bio.RNASeqResult.expressionLevel
    protected java.lang.String expressionLevel;
    public java.lang.String getExpressionLevel() { return expressionLevel; }
    public void setExpressionLevel(final java.lang.String expressionLevel) { this.expressionLevel = expressionLevel; }

    // Attr: org.intermine.model.bio.RNASeqResult.stage
    protected java.lang.String stage;
    public java.lang.String getStage() { return stage; }
    public void setStage(final java.lang.String stage) { this.stage = stage; }

    // Ref: org.intermine.model.bio.RNASeqResult.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof RNASeqResult && id != null) ? id.equals(((RNASeqResult)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "RNASeqResult [expressionLevel=" + (expressionLevel == null ? "null" : "\"" + expressionLevel + "\"") + ", expressionScore=" + expressionScore + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", id=" + id + ", stage=" + (stage == null ? "null" : "\"" + stage + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("expressionScore".equals(fieldName)) {
            return expressionScore;
        }
        if ("expressionLevel".equals(fieldName)) {
            return expressionLevel;
        }
        if ("stage".equals(fieldName)) {
            return stage;
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.RNASeqResult.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("expressionScore".equals(fieldName)) {
            return expressionScore;
        }
        if ("expressionLevel".equals(fieldName)) {
            return expressionLevel;
        }
        if ("stage".equals(fieldName)) {
            return stage;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.RNASeqResult.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("expressionScore".equals(fieldName)) {
            expressionScore = (java.lang.Double) value;
        } else if ("expressionLevel".equals(fieldName)) {
            expressionLevel = (java.lang.String) value;
        } else if ("stage".equals(fieldName)) {
            stage = (java.lang.String) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.RNASeqResult.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("expressionScore".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("expressionLevel".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("stage".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.RNASeqResult.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.RNASeqResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.RNASeqResultShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.RNASeqResult");
        if (expressionScore != null) {
            sb.append("$_^aexpressionScore$_^").append(expressionScore);
        }
        if (expressionLevel != null) {
            sb.append("$_^aexpressionLevel$_^");
            String string = expressionLevel;
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
        if (stage != null) {
            sb.append("$_^astage$_^");
            String string = stage;
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
        if (gene != null) {
            sb.append("$_^rgene$_^").append(gene.getId());
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
        if (!org.intermine.model.bio.RNASeqResultShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.RNASeqResult)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aexpressionScore".equals(notXml[i])) {
                i++;
                expressionScore = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aexpressionLevel".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                expressionLevel = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astage".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                stage = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
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
            if (!org.intermine.model.bio.RNASeqResult.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.RNASeqResult.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.RNASeqResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
