package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class MatureTranscriptShadow implements MatureTranscript, ShadowClass
{
    public static final Class<MatureTranscript> shadowOf = MatureTranscript.class;
    // Attr: org.intermine.model.bio.MatureTranscript.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.MatureTranscript.mirbaseIdentifier
    protected java.lang.String mirbaseIdentifier;
    public java.lang.String getMirbaseIdentifier() { return mirbaseIdentifier; }
    public void setMirbaseIdentifier(final java.lang.String mirbaseIdentifier) { this.mirbaseIdentifier = mirbaseIdentifier; }

    // Attr: org.intermine.model.bio.MatureTranscript.chromosome
    protected java.lang.String chromosome;
    public java.lang.String getChromosome() { return chromosome; }
    public void setChromosome(final java.lang.String chromosome) { this.chromosome = chromosome; }

    // Attr: org.intermine.model.bio.MatureTranscript.start
    protected java.lang.Integer start;
    public java.lang.Integer getStart() { return start; }
    public void setStart(final java.lang.Integer start) { this.start = start; }

    // Attr: org.intermine.model.bio.MatureTranscript.strand
    protected java.lang.Integer strand;
    public java.lang.Integer getStrand() { return strand; }
    public void setStrand(final java.lang.Integer strand) { this.strand = strand; }

    // Attr: org.intermine.model.bio.MatureTranscript.end
    protected java.lang.Integer end;
    public java.lang.Integer getEnd() { return end; }
    public void setEnd(final java.lang.Integer end) { this.end = end; }

    // Attr: org.intermine.model.bio.MatureTranscript.transcriptIdentifier
    protected java.lang.String transcriptIdentifier;
    public java.lang.String getTranscriptIdentifier() { return transcriptIdentifier; }
    public void setTranscriptIdentifier(final java.lang.String transcriptIdentifier) { this.transcriptIdentifier = transcriptIdentifier; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof MatureTranscript && id != null) ? id.equals(((MatureTranscript)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "MatureTranscript [chromosome=" + (chromosome == null ? "null" : "\"" + chromosome + "\"") + ", description=" + (description == null ? "null" : "\"" + description + "\"") + ", end=" + end + ", id=" + id + ", mirbaseIdentifier=" + (mirbaseIdentifier == null ? "null" : "\"" + mirbaseIdentifier + "\"") + ", start=" + start + ", strand=" + strand + ", transcriptIdentifier=" + (transcriptIdentifier == null ? "null" : "\"" + transcriptIdentifier + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("mirbaseIdentifier".equals(fieldName)) {
            return mirbaseIdentifier;
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
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MatureTranscript.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("mirbaseIdentifier".equals(fieldName)) {
            return mirbaseIdentifier;
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
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MatureTranscript.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("mirbaseIdentifier".equals(fieldName)) {
            mirbaseIdentifier = (java.lang.String) value;
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
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.MatureTranscript.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("mirbaseIdentifier".equals(fieldName)) {
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
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.MatureTranscript.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.MatureTranscript.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.MatureTranscriptShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.MatureTranscript");
        if (description != null) {
            sb.append("$_^adescription$_^");
            String string = description;
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
        if (mirbaseIdentifier != null) {
            sb.append("$_^amirbaseIdentifier$_^");
            String string = mirbaseIdentifier;
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
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.MatureTranscriptShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.MatureTranscript)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "adescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                description = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amirbaseIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                mirbaseIdentifier = string == null ? notXml[i] : string.toString();
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
            if (!org.intermine.model.bio.MatureTranscript.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.MatureTranscript.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.MatureTranscript.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
