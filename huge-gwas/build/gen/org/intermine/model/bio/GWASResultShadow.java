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

public class GWASResultShadow implements GWASResult, ShadowClass
{
    public static final Class<GWASResult> shadowOf = GWASResult.class;
    // Attr: org.intermine.model.bio.GWASResult.phenotype
    protected java.lang.String phenotype;
    public java.lang.String getPhenotype() { return phenotype; }
    public void setPhenotype(final java.lang.String phenotype) { this.phenotype = phenotype; }

    // Attr: org.intermine.model.bio.GWASResult.associatedVariantRiskAllele
    protected java.lang.String associatedVariantRiskAllele;
    public java.lang.String getAssociatedVariantRiskAllele() { return associatedVariantRiskAllele; }
    public void setAssociatedVariantRiskAllele(final java.lang.String associatedVariantRiskAllele) { this.associatedVariantRiskAllele = associatedVariantRiskAllele; }

    // Attr: org.intermine.model.bio.GWASResult.riskAlleleFreqInControls
    protected java.lang.Double riskAlleleFreqInControls;
    public java.lang.Double getRiskAlleleFreqInControls() { return riskAlleleFreqInControls; }
    public void setRiskAlleleFreqInControls(final java.lang.Double riskAlleleFreqInControls) { this.riskAlleleFreqInControls = riskAlleleFreqInControls; }

    // Attr: org.intermine.model.bio.GWASResult.pValue
    protected java.lang.Double pValue;
    public java.lang.Double getPValue() { return pValue; }
    public void setPValue(final java.lang.Double pValue) { this.pValue = pValue; }

    // Ref: org.intermine.model.bio.GWASResult.study
    protected org.intermine.model.InterMineObject study;
    public org.intermine.model.bio.GWAS getStudy() { if (study instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.GWAS) ((org.intermine.objectstore.proxy.ProxyReference) study).getObject()); }; return (org.intermine.model.bio.GWAS) study; }
    public void setStudy(final org.intermine.model.bio.GWAS study) { this.study = study; }
    public void proxyStudy(final org.intermine.objectstore.proxy.ProxyReference study) { this.study = study; }
    public org.intermine.model.InterMineObject proxGetStudy() { return study; }

    // Ref: org.intermine.model.bio.GWASResult.SNP
    protected org.intermine.model.InterMineObject SNP;
    public org.intermine.model.bio.SNP getsNP() { if (SNP instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.SNP) ((org.intermine.objectstore.proxy.ProxyReference) SNP).getObject()); }; return (org.intermine.model.bio.SNP) SNP; }
    public void setsNP(final org.intermine.model.bio.SNP SNP) { this.SNP = SNP; }
    public void proxysNP(final org.intermine.objectstore.proxy.ProxyReference SNP) { this.SNP = SNP; }
    public org.intermine.model.InterMineObject proxGetsNP() { return SNP; }

    // Ref: org.intermine.model.bio.GWASResult.source
    protected org.intermine.model.InterMineObject source;
    public org.intermine.model.bio.Source getSource() { if (source instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Source) ((org.intermine.objectstore.proxy.ProxyReference) source).getObject()); }; return (org.intermine.model.bio.Source) source; }
    public void setSource(final org.intermine.model.bio.Source source) { this.source = source; }
    public void proxySource(final org.intermine.objectstore.proxy.ProxyReference source) { this.source = source; }
    public org.intermine.model.InterMineObject proxGetSource() { return source; }

    // Col: org.intermine.model.bio.GWASResult.associatedGenes
    protected java.util.Set<org.intermine.model.bio.Gene> associatedGenes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getAssociatedGenes() { return associatedGenes; }
    public void setAssociatedGenes(final java.util.Set<org.intermine.model.bio.Gene> associatedGenes) { this.associatedGenes = associatedGenes; }
    public void addAssociatedGenes(final org.intermine.model.bio.Gene arg) { associatedGenes.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof GWASResult && id != null) ? id.equals(((GWASResult)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GWASResult [SNP=" + (SNP == null ? "null" : (SNP.getId() == null ? "no id" : SNP.getId().toString())) + ", associatedVariantRiskAllele=" + (associatedVariantRiskAllele == null ? "null" : "\"" + associatedVariantRiskAllele + "\"") + ", id=" + id + ", pValue=" + pValue + ", phenotype=" + (phenotype == null ? "null" : "\"" + phenotype + "\"") + ", riskAlleleFreqInControls=" + riskAlleleFreqInControls + ", source=" + (source == null ? "null" : (source.getId() == null ? "no id" : source.getId().toString())) + ", study=" + (study == null ? "null" : (study.getId() == null ? "no id" : study.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("phenotype".equals(fieldName)) {
            return phenotype;
        }
        if ("associatedVariantRiskAllele".equals(fieldName)) {
            return associatedVariantRiskAllele;
        }
        if ("riskAlleleFreqInControls".equals(fieldName)) {
            return riskAlleleFreqInControls;
        }
        if ("pValue".equals(fieldName)) {
            return pValue;
        }
        if ("study".equals(fieldName)) {
            if (study instanceof ProxyReference) {
                return ((ProxyReference) study).getObject();
            } else {
                return study;
            }
        }
        if ("SNP".equals(fieldName)) {
            if (SNP instanceof ProxyReference) {
                return ((ProxyReference) SNP).getObject();
            } else {
                return SNP;
            }
        }
        if ("source".equals(fieldName)) {
            if (source instanceof ProxyReference) {
                return ((ProxyReference) source).getObject();
            } else {
                return source;
            }
        }
        if ("associatedGenes".equals(fieldName)) {
            return associatedGenes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GWASResult.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("phenotype".equals(fieldName)) {
            return phenotype;
        }
        if ("associatedVariantRiskAllele".equals(fieldName)) {
            return associatedVariantRiskAllele;
        }
        if ("riskAlleleFreqInControls".equals(fieldName)) {
            return riskAlleleFreqInControls;
        }
        if ("pValue".equals(fieldName)) {
            return pValue;
        }
        if ("study".equals(fieldName)) {
            return study;
        }
        if ("SNP".equals(fieldName)) {
            return SNP;
        }
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("associatedGenes".equals(fieldName)) {
            return associatedGenes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GWASResult.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("phenotype".equals(fieldName)) {
            phenotype = (java.lang.String) value;
        } else if ("associatedVariantRiskAllele".equals(fieldName)) {
            associatedVariantRiskAllele = (java.lang.String) value;
        } else if ("riskAlleleFreqInControls".equals(fieldName)) {
            riskAlleleFreqInControls = (java.lang.Double) value;
        } else if ("pValue".equals(fieldName)) {
            pValue = (java.lang.Double) value;
        } else if ("study".equals(fieldName)) {
            study = (org.intermine.model.InterMineObject) value;
        } else if ("SNP".equals(fieldName)) {
            SNP = (org.intermine.model.InterMineObject) value;
        } else if ("source".equals(fieldName)) {
            source = (org.intermine.model.InterMineObject) value;
        } else if ("associatedGenes".equals(fieldName)) {
            associatedGenes = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GWASResult.class.equals(getClass())) {
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
        if ("associatedVariantRiskAllele".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("riskAlleleFreqInControls".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("pValue".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("study".equals(fieldName)) {
            return org.intermine.model.bio.GWAS.class;
        }
        if ("SNP".equals(fieldName)) {
            return org.intermine.model.bio.SNP.class;
        }
        if ("source".equals(fieldName)) {
            return org.intermine.model.bio.Source.class;
        }
        if ("associatedGenes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GWASResult.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GWASResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GWASResultShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GWASResult");
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
        if (associatedVariantRiskAllele != null) {
            sb.append("$_^aassociatedVariantRiskAllele$_^");
            String string = associatedVariantRiskAllele;
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
        if (riskAlleleFreqInControls != null) {
            sb.append("$_^ariskAlleleFreqInControls$_^").append(riskAlleleFreqInControls);
        }
        if (pValue != null) {
            sb.append("$_^apValue$_^").append(pValue);
        }
        if (study != null) {
            sb.append("$_^rstudy$_^").append(study.getId());
        }
        if (SNP != null) {
            sb.append("$_^rSNP$_^").append(SNP.getId());
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
        if (!org.intermine.model.bio.GWASResultShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GWASResult)");
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
            if ((i < notXml.length) && "aassociatedVariantRiskAllele".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                associatedVariantRiskAllele = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ariskAlleleFreqInControls".equals(notXml[i])) {
                i++;
                riskAlleleFreqInControls = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "apValue".equals(notXml[i])) {
                i++;
                pValue = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rstudy".equals(notXml[i])) {
                i++;
                study = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.GWAS.class);
                i++;
            };
            if ((i < notXml.length) &&"rSNP".equals(notXml[i])) {
                i++;
                SNP = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.SNP.class);
                i++;
            };
            if ((i < notXml.length) &&"rsource".equals(notXml[i])) {
                i++;
                source = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Source.class);
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
        associatedGenes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "associatedGenes", org.intermine.model.bio.Gene.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("associatedGenes".equals(fieldName)) {
            associatedGenes.add((org.intermine.model.bio.Gene) element);
        } else {
            if (!org.intermine.model.bio.GWASResult.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("associatedGenes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if (!org.intermine.model.bio.GWASResult.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GWASResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
