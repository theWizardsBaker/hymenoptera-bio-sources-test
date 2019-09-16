package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ProteinAtlasExpressionShadow implements ProteinAtlasExpression, ShadowClass
{
    public static final Class<ProteinAtlasExpression> shadowOf = ProteinAtlasExpression.class;
    // Attr: org.intermine.model.bio.ProteinAtlasExpression.expressionType
    protected java.lang.String expressionType;
    public java.lang.String getExpressionType() { return expressionType; }
    public void setExpressionType(final java.lang.String expressionType) { this.expressionType = expressionType; }

    // Attr: org.intermine.model.bio.ProteinAtlasExpression.level
    protected java.lang.String level;
    public java.lang.String getLevel() { return level; }
    public void setLevel(final java.lang.String level) { this.level = level; }

    // Attr: org.intermine.model.bio.ProteinAtlasExpression.cellType
    protected java.lang.String cellType;
    public java.lang.String getCellType() { return cellType; }
    public void setCellType(final java.lang.String cellType) { this.cellType = cellType; }

    // Attr: org.intermine.model.bio.ProteinAtlasExpression.reliability
    protected java.lang.String reliability;
    public java.lang.String getReliability() { return reliability; }
    public void setReliability(final java.lang.String reliability) { this.reliability = reliability; }

    // Ref: org.intermine.model.bio.ProteinAtlasExpression.tissue
    protected org.intermine.model.InterMineObject tissue;
    public org.intermine.model.bio.Tissue getTissue() { if (tissue instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Tissue) ((org.intermine.objectstore.proxy.ProxyReference) tissue).getObject()); }; return (org.intermine.model.bio.Tissue) tissue; }
    public void setTissue(final org.intermine.model.bio.Tissue tissue) { this.tissue = tissue; }
    public void proxyTissue(final org.intermine.objectstore.proxy.ProxyReference tissue) { this.tissue = tissue; }
    public org.intermine.model.InterMineObject proxGetTissue() { return tissue; }

    // Ref: org.intermine.model.bio.ProteinAtlasExpression.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ProteinAtlasExpression && id != null) ? id.equals(((ProteinAtlasExpression)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ProteinAtlasExpression [cellType=" + (cellType == null ? "null" : "\"" + cellType + "\"") + ", expressionType=" + (expressionType == null ? "null" : "\"" + expressionType + "\"") + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", id=" + id + ", level=" + (level == null ? "null" : "\"" + level + "\"") + ", reliability=" + (reliability == null ? "null" : "\"" + reliability + "\"") + ", tissue=" + (tissue == null ? "null" : (tissue.getId() == null ? "no id" : tissue.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("expressionType".equals(fieldName)) {
            return expressionType;
        }
        if ("level".equals(fieldName)) {
            return level;
        }
        if ("cellType".equals(fieldName)) {
            return cellType;
        }
        if ("reliability".equals(fieldName)) {
            return reliability;
        }
        if ("tissue".equals(fieldName)) {
            if (tissue instanceof ProxyReference) {
                return ((ProxyReference) tissue).getObject();
            } else {
                return tissue;
            }
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
        if (!org.intermine.model.bio.ProteinAtlasExpression.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("expressionType".equals(fieldName)) {
            return expressionType;
        }
        if ("level".equals(fieldName)) {
            return level;
        }
        if ("cellType".equals(fieldName)) {
            return cellType;
        }
        if ("reliability".equals(fieldName)) {
            return reliability;
        }
        if ("tissue".equals(fieldName)) {
            return tissue;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinAtlasExpression.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("expressionType".equals(fieldName)) {
            expressionType = (java.lang.String) value;
        } else if ("level".equals(fieldName)) {
            level = (java.lang.String) value;
        } else if ("cellType".equals(fieldName)) {
            cellType = (java.lang.String) value;
        } else if ("reliability".equals(fieldName)) {
            reliability = (java.lang.String) value;
        } else if ("tissue".equals(fieldName)) {
            tissue = (org.intermine.model.InterMineObject) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ProteinAtlasExpression.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("expressionType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("level".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("cellType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("reliability".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("tissue".equals(fieldName)) {
            return org.intermine.model.bio.Tissue.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ProteinAtlasExpression.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ProteinAtlasExpression.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ProteinAtlasExpressionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ProteinAtlasExpression");
        if (expressionType != null) {
            sb.append("$_^aexpressionType$_^");
            String string = expressionType;
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
        if (level != null) {
            sb.append("$_^alevel$_^");
            String string = level;
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
        if (cellType != null) {
            sb.append("$_^acellType$_^");
            String string = cellType;
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
        if (reliability != null) {
            sb.append("$_^areliability$_^");
            String string = reliability;
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
        if (tissue != null) {
            sb.append("$_^rtissue$_^").append(tissue.getId());
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
        if (!org.intermine.model.bio.ProteinAtlasExpressionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ProteinAtlasExpression)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aexpressionType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                expressionType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alevel".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                level = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acellType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                cellType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "areliability".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                reliability = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rtissue".equals(notXml[i])) {
                i++;
                tissue = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Tissue.class);
                i++;
            };
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
            if (!org.intermine.model.bio.ProteinAtlasExpression.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.ProteinAtlasExpression.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ProteinAtlasExpression.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
