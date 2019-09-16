package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class RNAiResultShadow implements RNAiResult, ShadowClass
{
    public static final Class<RNAiResult> shadowOf = RNAiResult.class;
    // Attr: org.intermine.model.bio.RNAiResult.phenotype
    protected java.lang.String phenotype;
    public java.lang.String getPhenotype() { return phenotype; }
    public void setPhenotype(final java.lang.String phenotype) { this.phenotype = phenotype; }

    // Attr: org.intermine.model.bio.RNAiResult.reagentId
    protected java.lang.String reagentId;
    public java.lang.String getReagentId() { return reagentId; }
    public void setReagentId(final java.lang.String reagentId) { this.reagentId = reagentId; }

    // Attr: org.intermine.model.bio.RNAiResult.score
    protected java.lang.String score;
    public java.lang.String getScore() { return score; }
    public void setScore(final java.lang.String score) { this.score = score; }

    // Attr: org.intermine.model.bio.RNAiResult.conditions
    protected java.lang.String conditions;
    public java.lang.String getConditions() { return conditions; }
    public void setConditions(final java.lang.String conditions) { this.conditions = conditions; }

    // Ref: org.intermine.model.bio.RNAiResult.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Ref: org.intermine.model.bio.RNAiResult.rnaiScreen
    protected org.intermine.model.InterMineObject rnaiScreen;
    public org.intermine.model.bio.RNAiScreen getRnaiScreen() { if (rnaiScreen instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.RNAiScreen) ((org.intermine.objectstore.proxy.ProxyReference) rnaiScreen).getObject()); }; return (org.intermine.model.bio.RNAiScreen) rnaiScreen; }
    public void setRnaiScreen(final org.intermine.model.bio.RNAiScreen rnaiScreen) { this.rnaiScreen = rnaiScreen; }
    public void proxyRnaiScreen(final org.intermine.objectstore.proxy.ProxyReference rnaiScreen) { this.rnaiScreen = rnaiScreen; }
    public org.intermine.model.InterMineObject proxGetRnaiScreen() { return rnaiScreen; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof RNAiResult && id != null) ? id.equals(((RNAiResult)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "RNAiResult [conditions=" + (conditions == null ? "null" : "\"" + conditions + "\"") + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", id=" + id + ", phenotype=" + (phenotype == null ? "null" : "\"" + phenotype + "\"") + ", reagentId=" + (reagentId == null ? "null" : "\"" + reagentId + "\"") + ", rnaiScreen=" + (rnaiScreen == null ? "null" : (rnaiScreen.getId() == null ? "no id" : rnaiScreen.getId().toString())) + ", score=" + (score == null ? "null" : "\"" + score + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("phenotype".equals(fieldName)) {
            return phenotype;
        }
        if ("reagentId".equals(fieldName)) {
            return reagentId;
        }
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("conditions".equals(fieldName)) {
            return conditions;
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("rnaiScreen".equals(fieldName)) {
            if (rnaiScreen instanceof ProxyReference) {
                return ((ProxyReference) rnaiScreen).getObject();
            } else {
                return rnaiScreen;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.RNAiResult.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("phenotype".equals(fieldName)) {
            return phenotype;
        }
        if ("reagentId".equals(fieldName)) {
            return reagentId;
        }
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("conditions".equals(fieldName)) {
            return conditions;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("rnaiScreen".equals(fieldName)) {
            return rnaiScreen;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.RNAiResult.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("phenotype".equals(fieldName)) {
            phenotype = (java.lang.String) value;
        } else if ("reagentId".equals(fieldName)) {
            reagentId = (java.lang.String) value;
        } else if ("score".equals(fieldName)) {
            score = (java.lang.String) value;
        } else if ("conditions".equals(fieldName)) {
            conditions = (java.lang.String) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("rnaiScreen".equals(fieldName)) {
            rnaiScreen = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.RNAiResult.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("phenotype".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("reagentId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("score".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("conditions".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("rnaiScreen".equals(fieldName)) {
            return org.intermine.model.bio.RNAiScreen.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.RNAiResult.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.RNAiResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.RNAiResultShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.RNAiResult");
        if (phenotype != null) {
            sb.append("$_^aphenotype$_^");
            String string = phenotype;
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
        if (reagentId != null) {
            sb.append("$_^areagentId$_^");
            String string = reagentId;
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
        if (score != null) {
            sb.append("$_^ascore$_^");
            String string = score;
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
        if (conditions != null) {
            sb.append("$_^aconditions$_^");
            String string = conditions;
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
        if (rnaiScreen != null) {
            sb.append("$_^rrnaiScreen$_^").append(rnaiScreen.getId());
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
        if (!org.intermine.model.bio.RNAiResultShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.RNAiResult)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aphenotype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                phenotype = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "areagentId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                reagentId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ascore".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                score = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aconditions".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                conditions = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) &&"rrnaiScreen".equals(notXml[i])) {
                i++;
                rnaiScreen = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.RNAiScreen.class);
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
            if (!org.intermine.model.bio.RNAiResult.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.RNAiResult.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.RNAiResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
