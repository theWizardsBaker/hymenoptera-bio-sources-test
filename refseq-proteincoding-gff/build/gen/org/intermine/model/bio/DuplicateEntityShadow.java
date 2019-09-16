package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class DuplicateEntityShadow implements DuplicateEntity, ShadowClass
{
    public static final Class<DuplicateEntity> shadowOf = DuplicateEntity.class;
    // Attr: org.intermine.model.bio.DuplicateEntity.proteinIdentifier
    protected java.lang.String proteinIdentifier;
    public java.lang.String getProteinIdentifier() { return proteinIdentifier; }
    public void setProteinIdentifier(final java.lang.String proteinIdentifier) { this.proteinIdentifier = proteinIdentifier; }

    // Attr: org.intermine.model.bio.DuplicateEntity.geneIdentifier
    protected java.lang.String geneIdentifier;
    public java.lang.String getGeneIdentifier() { return geneIdentifier; }
    public void setGeneIdentifier(final java.lang.String geneIdentifier) { this.geneIdentifier = geneIdentifier; }

    // Attr: org.intermine.model.bio.DuplicateEntity.chromosome
    protected java.lang.String chromosome;
    public java.lang.String getChromosome() { return chromosome; }
    public void setChromosome(final java.lang.String chromosome) { this.chromosome = chromosome; }

    // Attr: org.intermine.model.bio.DuplicateEntity.start
    protected java.lang.Integer start;
    public java.lang.Integer getStart() { return start; }
    public void setStart(final java.lang.Integer start) { this.start = start; }

    // Attr: org.intermine.model.bio.DuplicateEntity.strand
    protected java.lang.Integer strand;
    public java.lang.Integer getStrand() { return strand; }
    public void setStrand(final java.lang.Integer strand) { this.strand = strand; }

    // Attr: org.intermine.model.bio.DuplicateEntity.end
    protected java.lang.Integer end;
    public java.lang.Integer getEnd() { return end; }
    public void setEnd(final java.lang.Integer end) { this.end = end; }

    // Attr: org.intermine.model.bio.DuplicateEntity.transcriptIdentifier
    protected java.lang.String transcriptIdentifier;
    public java.lang.String getTranscriptIdentifier() { return transcriptIdentifier; }
    public void setTranscriptIdentifier(final java.lang.String transcriptIdentifier) { this.transcriptIdentifier = transcriptIdentifier; }

    // Ref: org.intermine.model.bio.DuplicateEntity.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof DuplicateEntity && id != null) ? id.equals(((DuplicateEntity)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "DuplicateEntity [chromosome=" + (chromosome == null ? "null" : "\"" + chromosome + "\"") + ", end=" + end + ", geneIdentifier=" + (geneIdentifier == null ? "null" : "\"" + geneIdentifier + "\"") + ", id=" + id + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", proteinIdentifier=" + (proteinIdentifier == null ? "null" : "\"" + proteinIdentifier + "\"") + ", start=" + start + ", strand=" + strand + ", transcriptIdentifier=" + (transcriptIdentifier == null ? "null" : "\"" + transcriptIdentifier + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("proteinIdentifier".equals(fieldName)) {
            return proteinIdentifier;
        }
        if ("geneIdentifier".equals(fieldName)) {
            return geneIdentifier;
        }
        if ("chromosome".equals(fieldName)) {
            return chromosome;
        }
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("strand".equals(fieldName)) {
            return strand;
        }
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("transcriptIdentifier".equals(fieldName)) {
            return transcriptIdentifier;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.DuplicateEntity.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("proteinIdentifier".equals(fieldName)) {
            return proteinIdentifier;
        }
        if ("geneIdentifier".equals(fieldName)) {
            return geneIdentifier;
        }
        if ("chromosome".equals(fieldName)) {
            return chromosome;
        }
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("strand".equals(fieldName)) {
            return strand;
        }
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("transcriptIdentifier".equals(fieldName)) {
            return transcriptIdentifier;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.DuplicateEntity.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("proteinIdentifier".equals(fieldName)) {
            proteinIdentifier = (java.lang.String) value;
        } else if ("geneIdentifier".equals(fieldName)) {
            geneIdentifier = (java.lang.String) value;
        } else if ("chromosome".equals(fieldName)) {
            chromosome = (java.lang.String) value;
        } else if ("start".equals(fieldName)) {
            start = (java.lang.Integer) value;
        } else if ("strand".equals(fieldName)) {
            strand = (java.lang.Integer) value;
        } else if ("end".equals(fieldName)) {
            end = (java.lang.Integer) value;
        } else if ("transcriptIdentifier".equals(fieldName)) {
            transcriptIdentifier = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.DuplicateEntity.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("proteinIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("geneIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("chromosome".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("start".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("strand".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("end".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("transcriptIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.DuplicateEntity.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.DuplicateEntity.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.DuplicateEntityShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.DuplicateEntity");
        if (proteinIdentifier != null) {
            sb.append("$_^aproteinIdentifier$_^");
            String string = proteinIdentifier;
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
        if (geneIdentifier != null) {
            sb.append("$_^ageneIdentifier$_^");
            String string = geneIdentifier;
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
        if (chromosome != null) {
            sb.append("$_^achromosome$_^");
            String string = chromosome;
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
        if (start != null) {
            sb.append("$_^astart$_^").append(start);
        }
        if (strand != null) {
            sb.append("$_^astrand$_^").append(strand);
        }
        if (end != null) {
            sb.append("$_^aend$_^").append(end);
        }
        if (transcriptIdentifier != null) {
            sb.append("$_^atranscriptIdentifier$_^");
            String string = transcriptIdentifier;
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
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
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
        if (!org.intermine.model.bio.DuplicateEntityShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.DuplicateEntity)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aproteinIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                proteinIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ageneIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                geneIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "achromosome".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                chromosome = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astart".equals(notXml[i])) {
                i++;
                start = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "astrand".equals(notXml[i])) {
                i++;
                strand = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aend".equals(notXml[i])) {
                i++;
                end = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "atranscriptIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                transcriptIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
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
            if (!org.intermine.model.bio.DuplicateEntity.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.DuplicateEntity.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.DuplicateEntity.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
