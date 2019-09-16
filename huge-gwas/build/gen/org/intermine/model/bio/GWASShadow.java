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

public class GWASShadow implements GWAS, ShadowClass
{
    public static final Class<GWAS> shadowOf = GWAS.class;
    // Attr: org.intermine.model.bio.GWAS.year
    protected java.lang.Integer year;
    public java.lang.Integer getYear() { return year; }
    public void setYear(final java.lang.Integer year) { this.year = year; }

    // Attr: org.intermine.model.bio.GWAS.initialSample
    protected java.lang.String initialSample;
    public java.lang.String getInitialSample() { return initialSample; }
    public void setInitialSample(final java.lang.String initialSample) { this.initialSample = initialSample; }

    // Attr: org.intermine.model.bio.GWAS.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.GWAS.firstAuthor
    protected java.lang.String firstAuthor;
    public java.lang.String getFirstAuthor() { return firstAuthor; }
    public void setFirstAuthor(final java.lang.String firstAuthor) { this.firstAuthor = firstAuthor; }

    // Attr: org.intermine.model.bio.GWAS.replicateSample
    protected java.lang.String replicateSample;
    public java.lang.String getReplicateSample() { return replicateSample; }
    public void setReplicateSample(final java.lang.String replicateSample) { this.replicateSample = replicateSample; }

    // Ref: org.intermine.model.bio.GWAS.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Col: org.intermine.model.bio.GWAS.results
    protected java.util.Set<org.intermine.model.bio.GWASResult> results = new java.util.HashSet<org.intermine.model.bio.GWASResult>();
    public java.util.Set<org.intermine.model.bio.GWASResult> getResults() { return results; }
    public void setResults(final java.util.Set<org.intermine.model.bio.GWASResult> results) { this.results = results; }
    public void addResults(final org.intermine.model.bio.GWASResult arg) { results.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof GWAS && id != null) ? id.equals(((GWAS)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GWAS [firstAuthor=" + (firstAuthor == null ? "null" : "\"" + firstAuthor + "\"") + ", id=" + id + ", initialSample=" + (initialSample == null ? "null" : "\"" + initialSample + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + ", replicateSample=" + (replicateSample == null ? "null" : "\"" + replicateSample + "\"") + ", year=" + year + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("year".equals(fieldName)) {
            return year;
        }
        if ("initialSample".equals(fieldName)) {
            return initialSample;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("firstAuthor".equals(fieldName)) {
            return firstAuthor;
        }
        if ("replicateSample".equals(fieldName)) {
            return replicateSample;
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("results".equals(fieldName)) {
            return results;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GWAS.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("year".equals(fieldName)) {
            return year;
        }
        if ("initialSample".equals(fieldName)) {
            return initialSample;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("firstAuthor".equals(fieldName)) {
            return firstAuthor;
        }
        if ("replicateSample".equals(fieldName)) {
            return replicateSample;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("results".equals(fieldName)) {
            return results;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GWAS.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("year".equals(fieldName)) {
            year = (java.lang.Integer) value;
        } else if ("initialSample".equals(fieldName)) {
            initialSample = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("firstAuthor".equals(fieldName)) {
            firstAuthor = (java.lang.String) value;
        } else if ("replicateSample".equals(fieldName)) {
            replicateSample = (java.lang.String) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("results".equals(fieldName)) {
            results = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GWAS.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("year".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("initialSample".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("firstAuthor".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("replicateSample".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("results".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GWAS.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GWAS.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GWASShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GWAS");
        if (year != null) {
            sb.append("$_^ayear$_^").append(year);
        }
        if (initialSample != null) {
            sb.append("$_^ainitialSample$_^");
            String string = initialSample;
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
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
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
        if (firstAuthor != null) {
            sb.append("$_^afirstAuthor$_^");
            String string = firstAuthor;
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
        if (replicateSample != null) {
            sb.append("$_^areplicateSample$_^");
            String string = replicateSample;
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
        if (publication != null) {
            sb.append("$_^rpublication$_^").append(publication.getId());
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
        if (!org.intermine.model.bio.GWASShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GWAS)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "ayear".equals(notXml[i])) {
                i++;
                year = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ainitialSample".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                initialSample = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afirstAuthor".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                firstAuthor = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "areplicateSample".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                replicateSample = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rpublication".equals(notXml[i])) {
                i++;
                publication = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Publication.class);
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
        results = new ProxyCollection<org.intermine.model.bio.GWASResult>(os, this, "results", org.intermine.model.bio.GWASResult.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("results".equals(fieldName)) {
            results.add((org.intermine.model.bio.GWASResult) element);
        } else {
            if (!org.intermine.model.bio.GWAS.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("results".equals(fieldName)) {
            return org.intermine.model.bio.GWASResult.class;
        }
        if (!org.intermine.model.bio.GWAS.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GWAS.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
