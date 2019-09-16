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

public class GenotypeShadow implements Genotype, ShadowClass
{
    public static final Class<Genotype> shadowOf = Genotype.class;
    // Attr: org.intermine.model.bio.Genotype.geneticBackground
    protected java.lang.String geneticBackground;
    public java.lang.String getGeneticBackground() { return geneticBackground; }
    public void setGeneticBackground(final java.lang.String geneticBackground) { this.geneticBackground = geneticBackground; }

    // Attr: org.intermine.model.bio.Genotype.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.Genotype.zygosity
    protected java.lang.String zygosity;
    public java.lang.String getZygosity() { return zygosity; }
    public void setZygosity(final java.lang.String zygosity) { this.zygosity = zygosity; }

    // Ref: org.intermine.model.bio.Genotype.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.Genotype.alleles
    protected java.util.Set<org.intermine.model.bio.Allele> alleles = new java.util.HashSet<org.intermine.model.bio.Allele>();
    public java.util.Set<org.intermine.model.bio.Allele> getAlleles() { return alleles; }
    public void setAlleles(final java.util.Set<org.intermine.model.bio.Allele> alleles) { this.alleles = alleles; }
    public void addAlleles(final org.intermine.model.bio.Allele arg) { alleles.add(arg); }

    // Col: org.intermine.model.bio.Genotype.phenotypeTerms
    protected java.util.Set<org.intermine.model.bio.MammalianPhenotypeTerm> phenotypeTerms = new java.util.HashSet<org.intermine.model.bio.MammalianPhenotypeTerm>();
    public java.util.Set<org.intermine.model.bio.MammalianPhenotypeTerm> getPhenotypeTerms() { return phenotypeTerms; }
    public void setPhenotypeTerms(final java.util.Set<org.intermine.model.bio.MammalianPhenotypeTerm> phenotypeTerms) { this.phenotypeTerms = phenotypeTerms; }
    public void addPhenotypeTerms(final org.intermine.model.bio.MammalianPhenotypeTerm arg) { phenotypeTerms.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Genotype && id != null) ? id.equals(((Genotype)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Genotype [geneticBackground=" + (geneticBackground == null ? "null" : "\"" + geneticBackground + "\"") + ", id=" + id + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", zygosity=" + (zygosity == null ? "null" : "\"" + zygosity + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("geneticBackground".equals(fieldName)) {
            return geneticBackground;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("zygosity".equals(fieldName)) {
            return zygosity;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("alleles".equals(fieldName)) {
            return alleles;
        }
        if ("phenotypeTerms".equals(fieldName)) {
            return phenotypeTerms;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("geneticBackground".equals(fieldName)) {
            return geneticBackground;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("zygosity".equals(fieldName)) {
            return zygosity;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("alleles".equals(fieldName)) {
            return alleles;
        }
        if ("phenotypeTerms".equals(fieldName)) {
            return phenotypeTerms;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("geneticBackground".equals(fieldName)) {
            geneticBackground = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("zygosity".equals(fieldName)) {
            zygosity = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("alleles".equals(fieldName)) {
            alleles = (java.util.Set) value;
        } else if ("phenotypeTerms".equals(fieldName)) {
            phenotypeTerms = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("geneticBackground".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("zygosity".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("alleles".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("phenotypeTerms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Genotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GenotypeShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Genotype");
        if (geneticBackground != null) {
            sb.append("$_^ageneticBackground$_^");
            String string = geneticBackground;
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
        if (zygosity != null) {
            sb.append("$_^azygosity$_^");
            String string = zygosity;
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
        if (!org.intermine.model.bio.GenotypeShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Genotype)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "ageneticBackground".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                geneticBackground = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "azygosity".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                zygosity = string == null ? notXml[i] : string.toString();
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
        alleles = new ProxyCollection<org.intermine.model.bio.Allele>(os, this, "alleles", org.intermine.model.bio.Allele.class);
        phenotypeTerms = new ProxyCollection<org.intermine.model.bio.MammalianPhenotypeTerm>(os, this, "phenotypeTerms", org.intermine.model.bio.MammalianPhenotypeTerm.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("alleles".equals(fieldName)) {
            alleles.add((org.intermine.model.bio.Allele) element);
        } else if ("phenotypeTerms".equals(fieldName)) {
            phenotypeTerms.add((org.intermine.model.bio.MammalianPhenotypeTerm) element);
        } else {
            if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("alleles".equals(fieldName)) {
            return org.intermine.model.bio.Allele.class;
        }
        if ("phenotypeTerms".equals(fieldName)) {
            return org.intermine.model.bio.MammalianPhenotypeTerm.class;
        }
        if (!org.intermine.model.bio.Genotype.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Genotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
