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

public class MRNAExpressionResultShadow implements MRNAExpressionResult, ShadowClass
{
    public static final Class<MRNAExpressionResult> shadowOf = MRNAExpressionResult.class;
    // Attr: org.intermine.model.bio.MRNAExpressionResult.expressed
    protected java.lang.Boolean expressed;
    public java.lang.Boolean getExpressed() { return expressed; }
    public void setExpressed(final java.lang.Boolean expressed) { this.expressed = expressed; }

    // Attr: org.intermine.model.bio.MRNAExpressionResult.stageRange
    protected java.lang.String stageRange;
    public java.lang.String getStageRange() { return stageRange; }
    public void setStageRange(final java.lang.String stageRange) { this.stageRange = stageRange; }

    // Ref: org.intermine.model.bio.MRNAExpressionResult.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Ref: org.intermine.model.bio.MRNAExpressionResult.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Ref: org.intermine.model.bio.MRNAExpressionResult.dataSet
    protected org.intermine.model.InterMineObject dataSet;
    public org.intermine.model.bio.DataSet getDataSet() { if (dataSet instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.DataSet) ((org.intermine.objectstore.proxy.ProxyReference) dataSet).getObject()); }; return (org.intermine.model.bio.DataSet) dataSet; }
    public void setDataSet(final org.intermine.model.bio.DataSet dataSet) { this.dataSet = dataSet; }
    public void proxyDataSet(final org.intermine.objectstore.proxy.ProxyReference dataSet) { this.dataSet = dataSet; }
    public org.intermine.model.InterMineObject proxGetDataSet() { return dataSet; }

    // Col: org.intermine.model.bio.MRNAExpressionResult.images
    protected java.util.Set<org.intermine.model.bio.Image> images = new java.util.HashSet<org.intermine.model.bio.Image>();
    public java.util.Set<org.intermine.model.bio.Image> getImages() { return images; }
    public void setImages(final java.util.Set<org.intermine.model.bio.Image> images) { this.images = images; }
    public void addImages(final org.intermine.model.bio.Image arg) { images.add(arg); }

    // Col: org.intermine.model.bio.MRNAExpressionResult.stages
    protected java.util.Set<org.intermine.model.bio.DevelopmentTerm> stages = new java.util.HashSet<org.intermine.model.bio.DevelopmentTerm>();
    public java.util.Set<org.intermine.model.bio.DevelopmentTerm> getStages() { return stages; }
    public void setStages(final java.util.Set<org.intermine.model.bio.DevelopmentTerm> stages) { this.stages = stages; }
    public void addStages(final org.intermine.model.bio.DevelopmentTerm arg) { stages.add(arg); }

    // Col: org.intermine.model.bio.MRNAExpressionResult.mRNAExpressionTerms
    protected java.util.Set<org.intermine.model.bio.OntologyTerm> mRNAExpressionTerms = new java.util.HashSet<org.intermine.model.bio.OntologyTerm>();
    public java.util.Set<org.intermine.model.bio.OntologyTerm> getMRNAExpressionTerms() { return mRNAExpressionTerms; }
    public void setMRNAExpressionTerms(final java.util.Set<org.intermine.model.bio.OntologyTerm> mRNAExpressionTerms) { this.mRNAExpressionTerms = mRNAExpressionTerms; }
    public void addMRNAExpressionTerms(final org.intermine.model.bio.OntologyTerm arg) { mRNAExpressionTerms.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof MRNAExpressionResult && id != null) ? id.equals(((MRNAExpressionResult)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "MRNAExpressionResult [dataSet=" + (dataSet == null ? "null" : (dataSet.getId() == null ? "no id" : dataSet.getId().toString())) + ", expressed=" + (expressed == null ? "null" : "\"" + expressed + "\"") + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", id=" + id + ", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + ", stageRange=" + (stageRange == null ? "null" : "\"" + stageRange + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("expressed".equals(fieldName)) {
            return expressed;
        }
        if ("stageRange".equals(fieldName)) {
            return stageRange;
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("dataSet".equals(fieldName)) {
            if (dataSet instanceof ProxyReference) {
                return ((ProxyReference) dataSet).getObject();
            } else {
                return dataSet;
            }
        }
        if ("images".equals(fieldName)) {
            return images;
        }
        if ("stages".equals(fieldName)) {
            return stages;
        }
        if ("mRNAExpressionTerms".equals(fieldName)) {
            return mRNAExpressionTerms;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MRNAExpressionResult.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("expressed".equals(fieldName)) {
            return expressed;
        }
        if ("stageRange".equals(fieldName)) {
            return stageRange;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("dataSet".equals(fieldName)) {
            return dataSet;
        }
        if ("images".equals(fieldName)) {
            return images;
        }
        if ("stages".equals(fieldName)) {
            return stages;
        }
        if ("mRNAExpressionTerms".equals(fieldName)) {
            return mRNAExpressionTerms;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MRNAExpressionResult.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("expressed".equals(fieldName)) {
            expressed = (java.lang.Boolean) value;
        } else if ("stageRange".equals(fieldName)) {
            stageRange = (java.lang.String) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("dataSet".equals(fieldName)) {
            dataSet = (org.intermine.model.InterMineObject) value;
        } else if ("images".equals(fieldName)) {
            images = (java.util.Set) value;
        } else if ("stages".equals(fieldName)) {
            stages = (java.util.Set) value;
        } else if ("mRNAExpressionTerms".equals(fieldName)) {
            mRNAExpressionTerms = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.MRNAExpressionResult.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("expressed".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("stageRange".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("dataSet".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("images".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("stages".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("mRNAExpressionTerms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.MRNAExpressionResult.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.MRNAExpressionResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.MRNAExpressionResultShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.MRNAExpressionResult");
        if (expressed != null) {
            sb.append("$_^aexpressed$_^").append(expressed);
        }
        if (stageRange != null) {
            sb.append("$_^astageRange$_^");
            String string = stageRange;
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
        if (publication != null) {
            sb.append("$_^rpublication$_^").append(publication.getId());
        }
        if (dataSet != null) {
            sb.append("$_^rdataSet$_^").append(dataSet.getId());
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
        if (!org.intermine.model.bio.MRNAExpressionResultShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.MRNAExpressionResult)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aexpressed".equals(notXml[i])) {
                i++;
                expressed = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "astageRange".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                stageRange = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) &&"rpublication".equals(notXml[i])) {
                i++;
                publication = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Publication.class);
                i++;
            };
            if ((i < notXml.length) &&"rdataSet".equals(notXml[i])) {
                i++;
                dataSet = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.DataSet.class);
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
        images = new ProxyCollection<org.intermine.model.bio.Image>(os, this, "images", org.intermine.model.bio.Image.class);
        stages = new ProxyCollection<org.intermine.model.bio.DevelopmentTerm>(os, this, "stages", org.intermine.model.bio.DevelopmentTerm.class);
        mRNAExpressionTerms = new ProxyCollection<org.intermine.model.bio.OntologyTerm>(os, this, "mRNAExpressionTerms", org.intermine.model.bio.OntologyTerm.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("images".equals(fieldName)) {
            images.add((org.intermine.model.bio.Image) element);
        } else if ("stages".equals(fieldName)) {
            stages.add((org.intermine.model.bio.DevelopmentTerm) element);
        } else if ("mRNAExpressionTerms".equals(fieldName)) {
            mRNAExpressionTerms.add((org.intermine.model.bio.OntologyTerm) element);
        } else {
            if (!org.intermine.model.bio.MRNAExpressionResult.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("images".equals(fieldName)) {
            return org.intermine.model.bio.Image.class;
        }
        if ("stages".equals(fieldName)) {
            return org.intermine.model.bio.DevelopmentTerm.class;
        }
        if ("mRNAExpressionTerms".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if (!org.intermine.model.bio.MRNAExpressionResult.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.MRNAExpressionResult.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
