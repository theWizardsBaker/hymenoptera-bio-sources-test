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

public class RNAiScreenShadow implements RNAiScreen, ShadowClass
{
    public static final Class<RNAiScreen> shadowOf = RNAiScreen.class;
    // Attr: org.intermine.model.bio.RNAiScreen.bioSourceType
    protected java.lang.String bioSourceType;
    public java.lang.String getBioSourceType() { return bioSourceType; }
    public void setBioSourceType(final java.lang.String bioSourceType) { this.bioSourceType = bioSourceType; }

    // Attr: org.intermine.model.bio.RNAiScreen.method
    protected java.lang.String method;
    public java.lang.String getMethod() { return method; }
    public void setMethod(final java.lang.String method) { this.method = method; }

    // Attr: org.intermine.model.bio.RNAiScreen.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.RNAiScreen.bioSourceName
    protected java.lang.String bioSourceName;
    public java.lang.String getBioSourceName() { return bioSourceName; }
    public void setBioSourceName(final java.lang.String bioSourceName) { this.bioSourceName = bioSourceName; }

    // Attr: org.intermine.model.bio.RNAiScreen.scoreType
    protected java.lang.String scoreType;
    public java.lang.String getScoreType() { return scoreType; }
    public void setScoreType(final java.lang.String scoreType) { this.scoreType = scoreType; }

    // Attr: org.intermine.model.bio.RNAiScreen.assay
    protected java.lang.String assay;
    public java.lang.String getAssay() { return assay; }
    public void setAssay(final java.lang.String assay) { this.assay = assay; }

    // Attr: org.intermine.model.bio.RNAiScreen.scoreCutoff
    protected java.lang.String scoreCutoff;
    public java.lang.String getScoreCutoff() { return scoreCutoff; }
    public void setScoreCutoff(final java.lang.String scoreCutoff) { this.scoreCutoff = scoreCutoff; }

    // Attr: org.intermine.model.bio.RNAiScreen.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.RNAiScreen.reagentType
    protected java.lang.String reagentType;
    public java.lang.String getReagentType() { return reagentType; }
    public void setReagentType(final java.lang.String reagentType) { this.reagentType = reagentType; }

    // Attr: org.intermine.model.bio.RNAiScreen.library
    protected java.lang.String library;
    public java.lang.String getLibrary() { return library; }
    public void setLibrary(final java.lang.String library) { this.library = library; }

    // Ref: org.intermine.model.bio.RNAiScreen.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Col: org.intermine.model.bio.RNAiScreen.rnaiResults
    protected java.util.Set<org.intermine.model.bio.RNAiResult> rnaiResults = new java.util.HashSet<org.intermine.model.bio.RNAiResult>();
    public java.util.Set<org.intermine.model.bio.RNAiResult> getRnaiResults() { return rnaiResults; }
    public void setRnaiResults(final java.util.Set<org.intermine.model.bio.RNAiResult> rnaiResults) { this.rnaiResults = rnaiResults; }
    public void addRnaiResults(final org.intermine.model.bio.RNAiResult arg) { rnaiResults.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof RNAiScreen && id != null) ? id.equals(((RNAiScreen)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "RNAiScreen [assay=" + (assay == null ? "null" : "\"" + assay + "\"") + ", bioSourceName=" + (bioSourceName == null ? "null" : "\"" + bioSourceName + "\"") + ", bioSourceType=" + (bioSourceType == null ? "null" : "\"" + bioSourceType + "\"") + ", id=" + id + ", identifier=" + (identifier == null ? "null" : "\"" + identifier + "\"") + ", library=" + (library == null ? "null" : "\"" + library + "\"") + ", method=" + (method == null ? "null" : "\"" + method + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + ", reagentType=" + (reagentType == null ? "null" : "\"" + reagentType + "\"") + ", scoreCutoff=" + (scoreCutoff == null ? "null" : "\"" + scoreCutoff + "\"") + ", scoreType=" + (scoreType == null ? "null" : "\"" + scoreType + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("bioSourceType".equals(fieldName)) {
            return bioSourceType;
        }
        if ("method".equals(fieldName)) {
            return method;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("bioSourceName".equals(fieldName)) {
            return bioSourceName;
        }
        if ("scoreType".equals(fieldName)) {
            return scoreType;
        }
        if ("assay".equals(fieldName)) {
            return assay;
        }
        if ("scoreCutoff".equals(fieldName)) {
            return scoreCutoff;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("reagentType".equals(fieldName)) {
            return reagentType;
        }
        if ("library".equals(fieldName)) {
            return library;
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("rnaiResults".equals(fieldName)) {
            return rnaiResults;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.RNAiScreen.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("bioSourceType".equals(fieldName)) {
            return bioSourceType;
        }
        if ("method".equals(fieldName)) {
            return method;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("bioSourceName".equals(fieldName)) {
            return bioSourceName;
        }
        if ("scoreType".equals(fieldName)) {
            return scoreType;
        }
        if ("assay".equals(fieldName)) {
            return assay;
        }
        if ("scoreCutoff".equals(fieldName)) {
            return scoreCutoff;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("reagentType".equals(fieldName)) {
            return reagentType;
        }
        if ("library".equals(fieldName)) {
            return library;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("rnaiResults".equals(fieldName)) {
            return rnaiResults;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.RNAiScreen.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("bioSourceType".equals(fieldName)) {
            bioSourceType = (java.lang.String) value;
        } else if ("method".equals(fieldName)) {
            method = (java.lang.String) value;
        } else if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("bioSourceName".equals(fieldName)) {
            bioSourceName = (java.lang.String) value;
        } else if ("scoreType".equals(fieldName)) {
            scoreType = (java.lang.String) value;
        } else if ("assay".equals(fieldName)) {
            assay = (java.lang.String) value;
        } else if ("scoreCutoff".equals(fieldName)) {
            scoreCutoff = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("reagentType".equals(fieldName)) {
            reagentType = (java.lang.String) value;
        } else if ("library".equals(fieldName)) {
            library = (java.lang.String) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("rnaiResults".equals(fieldName)) {
            rnaiResults = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.RNAiScreen.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("bioSourceType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("method".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bioSourceName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("scoreType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("assay".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("scoreCutoff".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("reagentType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("library".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("rnaiResults".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.RNAiScreen.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.RNAiScreen.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.RNAiScreenShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.RNAiScreen");
        if (bioSourceType != null) {
            sb.append("$_^abioSourceType$_^");
            String string = bioSourceType;
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
        if (method != null) {
            sb.append("$_^amethod$_^");
            String string = method;
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
        if (identifier != null) {
            sb.append("$_^aidentifier$_^");
            String string = identifier;
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
        if (bioSourceName != null) {
            sb.append("$_^abioSourceName$_^");
            String string = bioSourceName;
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
        if (scoreType != null) {
            sb.append("$_^ascoreType$_^");
            String string = scoreType;
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
        if (assay != null) {
            sb.append("$_^aassay$_^");
            String string = assay;
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
        if (scoreCutoff != null) {
            sb.append("$_^ascoreCutoff$_^");
            String string = scoreCutoff;
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
        if (reagentType != null) {
            sb.append("$_^areagentType$_^");
            String string = reagentType;
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
        if (library != null) {
            sb.append("$_^alibrary$_^");
            String string = library;
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
        if (!org.intermine.model.bio.RNAiScreenShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.RNAiScreen)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "abioSourceType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bioSourceType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amethod".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                method = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aidentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                identifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abioSourceName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bioSourceName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ascoreType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                scoreType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aassay".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                assay = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ascoreCutoff".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                scoreCutoff = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "areagentType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                reagentType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibrary".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                library = string == null ? notXml[i] : string.toString();
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
        rnaiResults = new ProxyCollection<org.intermine.model.bio.RNAiResult>(os, this, "rnaiResults", org.intermine.model.bio.RNAiResult.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("rnaiResults".equals(fieldName)) {
            rnaiResults.add((org.intermine.model.bio.RNAiResult) element);
        } else {
            if (!org.intermine.model.bio.RNAiScreen.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("rnaiResults".equals(fieldName)) {
            return org.intermine.model.bio.RNAiResult.class;
        }
        if (!org.intermine.model.bio.RNAiScreen.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.RNAiScreen.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
