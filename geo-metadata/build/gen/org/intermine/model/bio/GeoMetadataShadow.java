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

public class GeoMetadataShadow implements GeoMetadata, ShadowClass
{
    public static final Class<GeoMetadata> shadowOf = GeoMetadata.class;
    // Attr: org.intermine.model.bio.GeoMetadata.series
    protected java.lang.String series;
    public java.lang.String getSeries() { return series; }
    public void setSeries(final java.lang.String series) { this.series = series; }

    // Attr: org.intermine.model.bio.GeoMetadata.summary
    protected java.lang.String summary;
    public java.lang.String getSummary() { return summary; }
    public void setSummary(final java.lang.String summary) { this.summary = summary; }

    // Attr: org.intermine.model.bio.GeoMetadata.title
    protected java.lang.String title;
    public java.lang.String getTitle() { return title; }
    public void setTitle(final java.lang.String title) { this.title = title; }

    // Attr: org.intermine.model.bio.GeoMetadata.platformDesign
    protected java.lang.String platformDesign;
    public java.lang.String getPlatformDesign() { return platformDesign; }
    public void setPlatformDesign(final java.lang.String platformDesign) { this.platformDesign = platformDesign; }

    // Attr: org.intermine.model.bio.GeoMetadata.platform
    protected java.lang.String platform;
    public java.lang.String getPlatform() { return platform; }
    public void setPlatform(final java.lang.String platform) { this.platform = platform; }

    // Attr: org.intermine.model.bio.GeoMetadata.samples
    protected java.lang.String samples;
    public java.lang.String getSamples() { return samples; }
    public void setSamples(final java.lang.String samples) { this.samples = samples; }

    // Attr: org.intermine.model.bio.GeoMetadata.contributor
    protected java.lang.String contributor;
    public java.lang.String getContributor() { return contributor; }
    public void setContributor(final java.lang.String contributor) { this.contributor = contributor; }

    // Attr: org.intermine.model.bio.GeoMetadata.experiment
    protected java.lang.String experiment;
    public java.lang.String getExperiment() { return experiment; }
    public void setExperiment(final java.lang.String experiment) { this.experiment = experiment; }

    // Attr: org.intermine.model.bio.GeoMetadata.contact
    protected java.lang.String contact;
    public java.lang.String getContact() { return contact; }
    public void setContact(final java.lang.String contact) { this.contact = contact; }

    // Attr: org.intermine.model.bio.GeoMetadata.design
    protected java.lang.String design;
    public java.lang.String getDesign() { return design; }
    public void setDesign(final java.lang.String design) { this.design = design; }

    // Ref: org.intermine.model.bio.GeoMetadata.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.GeoMetadata.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof GeoMetadata && id != null) ? id.equals(((GeoMetadata)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GeoMetadata [contact=" + (contact == null ? "null" : "\"" + contact + "\"") + ", contributor=" + (contributor == null ? "null" : "\"" + contributor + "\"") + ", design=" + (design == null ? "null" : "\"" + design + "\"") + ", experiment=" + (experiment == null ? "null" : "\"" + experiment + "\"") + ", id=" + id + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", platform=" + (platform == null ? "null" : "\"" + platform + "\"") + ", platformDesign=" + (platformDesign == null ? "null" : "\"" + platformDesign + "\"") + ", samples=" + (samples == null ? "null" : "\"" + samples + "\"") + ", series=" + (series == null ? "null" : "\"" + series + "\"") + ", summary=" + (summary == null ? "null" : "\"" + summary + "\"") + ", title=" + (title == null ? "null" : "\"" + title + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("series".equals(fieldName)) {
            return series;
        }
        if ("summary".equals(fieldName)) {
            return summary;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("platformDesign".equals(fieldName)) {
            return platformDesign;
        }
        if ("platform".equals(fieldName)) {
            return platform;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("contributor".equals(fieldName)) {
            return contributor;
        }
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("contact".equals(fieldName)) {
            return contact;
        }
        if ("design".equals(fieldName)) {
            return design;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GeoMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("series".equals(fieldName)) {
            return series;
        }
        if ("summary".equals(fieldName)) {
            return summary;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("platformDesign".equals(fieldName)) {
            return platformDesign;
        }
        if ("platform".equals(fieldName)) {
            return platform;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("contributor".equals(fieldName)) {
            return contributor;
        }
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("contact".equals(fieldName)) {
            return contact;
        }
        if ("design".equals(fieldName)) {
            return design;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GeoMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("series".equals(fieldName)) {
            series = (java.lang.String) value;
        } else if ("summary".equals(fieldName)) {
            summary = (java.lang.String) value;
        } else if ("title".equals(fieldName)) {
            title = (java.lang.String) value;
        } else if ("platformDesign".equals(fieldName)) {
            platformDesign = (java.lang.String) value;
        } else if ("platform".equals(fieldName)) {
            platform = (java.lang.String) value;
        } else if ("samples".equals(fieldName)) {
            samples = (java.lang.String) value;
        } else if ("contributor".equals(fieldName)) {
            contributor = (java.lang.String) value;
        } else if ("experiment".equals(fieldName)) {
            experiment = (java.lang.String) value;
        } else if ("contact".equals(fieldName)) {
            contact = (java.lang.String) value;
        } else if ("design".equals(fieldName)) {
            design = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GeoMetadata.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("series".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("summary".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("title".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("platformDesign".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("platform".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("samples".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("contributor".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("experiment".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("contact".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("design".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GeoMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GeoMetadata.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GeoMetadataShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GeoMetadata");
        if (series != null) {
            sb.append("$_^aseries$_^");
            String string = series;
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
        if (summary != null) {
            sb.append("$_^asummary$_^");
            String string = summary;
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
        if (title != null) {
            sb.append("$_^atitle$_^");
            String string = title;
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
        if (platformDesign != null) {
            sb.append("$_^aplatformDesign$_^");
            String string = platformDesign;
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
        if (platform != null) {
            sb.append("$_^aplatform$_^");
            String string = platform;
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
        if (samples != null) {
            sb.append("$_^asamples$_^");
            String string = samples;
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
        if (contributor != null) {
            sb.append("$_^acontributor$_^");
            String string = contributor;
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
        if (experiment != null) {
            sb.append("$_^aexperiment$_^");
            String string = experiment;
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
        if (contact != null) {
            sb.append("$_^acontact$_^");
            String string = contact;
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
        if (design != null) {
            sb.append("$_^adesign$_^");
            String string = design;
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
        if (!org.intermine.model.bio.GeoMetadataShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GeoMetadata)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aseries".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                series = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asummary".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                summary = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atitle".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                title = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aplatformDesign".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                platformDesign = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aplatform".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                platform = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asamples".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                samples = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acontributor".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                contributor = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aexperiment".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                experiment = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acontact".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                contact = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adesign".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                design = string == null ? notXml[i] : string.toString();
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
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.GeoMetadata.class.equals(getClass())) {
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
        if (!org.intermine.model.bio.GeoMetadata.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GeoMetadata.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
