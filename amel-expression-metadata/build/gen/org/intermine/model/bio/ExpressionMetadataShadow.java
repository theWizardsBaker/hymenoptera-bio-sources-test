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

public class ExpressionMetadataShadow implements ExpressionMetadata, ShadowClass
{
    public static final Class<ExpressionMetadata> shadowOf = ExpressionMetadata.class;
    // Attr: org.intermine.model.bio.ExpressionMetadata.sampleName
    protected java.lang.String sampleName;
    public java.lang.String getSampleName() { return sampleName; }
    public void setSampleName(final java.lang.String sampleName) { this.sampleName = sampleName; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sraStudyAccession
    protected java.lang.String sraStudyAccession;
    public java.lang.String getSraStudyAccession() { return sraStudyAccession; }
    public void setSraStudyAccession(final java.lang.String sraStudyAccession) { this.sraStudyAccession = sraStudyAccession; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sampleType
    protected java.lang.String sampleType;
    public java.lang.String getSampleType() { return sampleType; }
    public void setSampleType(final java.lang.String sampleType) { this.sampleType = sampleType; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.instrument
    protected java.lang.String instrument;
    public java.lang.String getInstrument() { return instrument; }
    public void setInstrument(final java.lang.String instrument) { this.instrument = instrument; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sex
    protected java.lang.String sex;
    public java.lang.String getSex() { return sex; }
    public void setSex(final java.lang.String sex) { this.sex = sex; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.design
    protected java.lang.String design;
    public java.lang.String getDesign() { return design; }
    public void setDesign(final java.lang.String design) { this.design = design; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.projectId
    protected java.lang.String projectId;
    public java.lang.String getProjectId() { return projectId; }
    public void setProjectId(final java.lang.String projectId) { this.projectId = projectId; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sraSampleAccession
    protected java.lang.String sraSampleAccession;
    public java.lang.String getSraSampleAccession() { return sraSampleAccession; }
    public void setSraSampleAccession(final java.lang.String sraSampleAccession) { this.sraSampleAccession = sraSampleAccession; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.results
    protected java.lang.String results;
    public java.lang.String getResults() { return results; }
    public void setResults(final java.lang.String results) { this.results = results; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sraSubmissionAccession
    protected java.lang.String sraSubmissionAccession;
    public java.lang.String getSraSubmissionAccession() { return sraSubmissionAccession; }
    public void setSraSubmissionAccession(final java.lang.String sraSubmissionAccession) { this.sraSubmissionAccession = sraSubmissionAccession; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.libraryName
    protected java.lang.String libraryName;
    public java.lang.String getLibraryName() { return libraryName; }
    public void setLibraryName(final java.lang.String libraryName) { this.libraryName = libraryName; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.librarySelection
    protected java.lang.String librarySelection;
    public java.lang.String getLibrarySelection() { return librarySelection; }
    public void setLibrarySelection(final java.lang.String librarySelection) { this.librarySelection = librarySelection; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.tissueType
    protected java.lang.String tissueType;
    public java.lang.String getTissueType() { return tissueType; }
    public void setTissueType(final java.lang.String tissueType) { this.tissueType = tissueType; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.scientificName
    protected java.lang.String scientificName;
    public java.lang.String getScientificName() { return scientificName; }
    public void setScientificName(final java.lang.String scientificName) { this.scientificName = scientificName; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.spots
    protected java.lang.String spots;
    public java.lang.String getSpots() { return spots; }
    public void setSpots(final java.lang.String spots) { this.spots = spots; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.libraryStrategy
    protected java.lang.String libraryStrategy;
    public java.lang.String getLibraryStrategy() { return libraryStrategy; }
    public void setLibraryStrategy(final java.lang.String libraryStrategy) { this.libraryStrategy = libraryStrategy; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.beeType
    protected java.lang.String beeType;
    public java.lang.String getBeeType() { return beeType; }
    public void setBeeType(final java.lang.String beeType) { this.beeType = beeType; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.insertSizeStandardDeviation
    protected java.lang.String insertSizeStandardDeviation;
    public java.lang.String getInsertSizeStandardDeviation() { return insertSizeStandardDeviation; }
    public void setInsertSizeStandardDeviation(final java.lang.String insertSizeStandardDeviation) { this.insertSizeStandardDeviation = insertSizeStandardDeviation; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.ftpLocation
    protected java.lang.String ftpLocation;
    public java.lang.String getFtpLocation() { return ftpLocation; }
    public void setFtpLocation(final java.lang.String ftpLocation) { this.ftpLocation = ftpLocation; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sraExperimentAccession
    protected java.lang.String sraExperimentAccession;
    public java.lang.String getSraExperimentAccession() { return sraExperimentAccession; }
    public void setSraExperimentAccession(final java.lang.String sraExperimentAccession) { this.sraExperimentAccession = sraExperimentAccession; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.libraryLayout
    protected java.lang.String libraryLayout;
    public java.lang.String getLibraryLayout() { return libraryLayout; }
    public void setLibraryLayout(final java.lang.String libraryLayout) { this.libraryLayout = libraryLayout; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.bases
    protected java.lang.String bases;
    public java.lang.String getBases() { return bases; }
    public void setBases(final java.lang.String bases) { this.bases = bases; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.experimentAbstract
    protected java.lang.String experimentAbstract;
    public java.lang.String getExperimentAbstract() { return experimentAbstract; }
    public void setExperimentAbstract(final java.lang.String experimentAbstract) { this.experimentAbstract = experimentAbstract; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sraRunAccession
    protected java.lang.String sraRunAccession;
    public java.lang.String getSraRunAccession() { return sraRunAccession; }
    public void setSraRunAccession(final java.lang.String sraRunAccession) { this.sraRunAccession = sraRunAccession; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.insertSize
    protected java.lang.String insertSize;
    public java.lang.String getInsertSize() { return insertSize; }
    public void setInsertSize(final java.lang.String insertSize) { this.insertSize = insertSize; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.bioSampleId
    protected java.lang.String bioSampleId;
    public java.lang.String getBioSampleId() { return bioSampleId; }
    public void setBioSampleId(final java.lang.String bioSampleId) { this.bioSampleId = bioSampleId; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.averageReadLength
    protected java.lang.Integer averageReadLength;
    public java.lang.Integer getAverageReadLength() { return averageReadLength; }
    public void setAverageReadLength(final java.lang.Integer averageReadLength) { this.averageReadLength = averageReadLength; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.stage
    protected java.lang.String stage;
    public java.lang.String getStage() { return stage; }
    public void setStage(final java.lang.String stage) { this.stage = stage; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.tumor
    protected java.lang.String tumor;
    public java.lang.String getTumor() { return tumor; }
    public void setTumor(final java.lang.String tumor) { this.tumor = tumor; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.centerName
    protected java.lang.String centerName;
    public java.lang.String getCenterName() { return centerName; }
    public void setCenterName(final java.lang.String centerName) { this.centerName = centerName; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.sampleTaxon
    protected java.lang.String sampleTaxon;
    public java.lang.String getSampleTaxon() { return sampleTaxon; }
    public void setSampleTaxon(final java.lang.String sampleTaxon) { this.sampleTaxon = sampleTaxon; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.treatment
    protected java.lang.String treatment;
    public java.lang.String getTreatment() { return treatment; }
    public void setTreatment(final java.lang.String treatment) { this.treatment = treatment; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.projectGoal
    protected java.lang.String projectGoal;
    public java.lang.String getProjectGoal() { return projectGoal; }
    public void setProjectGoal(final java.lang.String projectGoal) { this.projectGoal = projectGoal; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.platform
    protected java.lang.String platform;
    public java.lang.String getPlatform() { return platform; }
    public void setPlatform(final java.lang.String platform) { this.platform = platform; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.objective
    protected java.lang.String objective;
    public java.lang.String getObjective() { return objective; }
    public void setObjective(final java.lang.String objective) { this.objective = objective; }

    // Attr: org.intermine.model.bio.ExpressionMetadata.bioProjectId
    protected java.lang.String bioProjectId;
    public java.lang.String getBioProjectId() { return bioProjectId; }
    public void setBioProjectId(final java.lang.String bioProjectId) { this.bioProjectId = bioProjectId; }

    // Ref: org.intermine.model.bio.ExpressionMetadata.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.ExpressionMetadata.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ExpressionMetadata && id != null) ? id.equals(((ExpressionMetadata)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ExpressionMetadata [averageReadLength=" + averageReadLength + ", bases=" + (bases == null ? "null" : "\"" + bases + "\"") + ", beeType=" + (beeType == null ? "null" : "\"" + beeType + "\"") + ", bioProjectId=" + (bioProjectId == null ? "null" : "\"" + bioProjectId + "\"") + ", bioSampleId=" + (bioSampleId == null ? "null" : "\"" + bioSampleId + "\"") + ", centerName=" + (centerName == null ? "null" : "\"" + centerName + "\"") + ", design=" + (design == null ? "null" : "\"" + design + "\"") + ", experimentAbstract=" + (experimentAbstract == null ? "null" : "\"" + experimentAbstract + "\"") + ", ftpLocation=" + (ftpLocation == null ? "null" : "\"" + ftpLocation + "\"") + ", id=" + id + ", insertSize=" + (insertSize == null ? "null" : "\"" + insertSize + "\"") + ", insertSizeStandardDeviation=" + (insertSizeStandardDeviation == null ? "null" : "\"" + insertSizeStandardDeviation + "\"") + ", instrument=" + (instrument == null ? "null" : "\"" + instrument + "\"") + ", libraryLayout=" + (libraryLayout == null ? "null" : "\"" + libraryLayout + "\"") + ", libraryName=" + (libraryName == null ? "null" : "\"" + libraryName + "\"") + ", librarySelection=" + (librarySelection == null ? "null" : "\"" + librarySelection + "\"") + ", libraryStrategy=" + (libraryStrategy == null ? "null" : "\"" + libraryStrategy + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", objective=" + (objective == null ? "null" : "\"" + objective + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", platform=" + (platform == null ? "null" : "\"" + platform + "\"") + ", projectGoal=" + (projectGoal == null ? "null" : "\"" + projectGoal + "\"") + ", projectId=" + (projectId == null ? "null" : "\"" + projectId + "\"") + ", results=" + (results == null ? "null" : "\"" + results + "\"") + ", sampleName=" + (sampleName == null ? "null" : "\"" + sampleName + "\"") + ", sampleTaxon=" + (sampleTaxon == null ? "null" : "\"" + sampleTaxon + "\"") + ", sampleType=" + (sampleType == null ? "null" : "\"" + sampleType + "\"") + ", scientificName=" + (scientificName == null ? "null" : "\"" + scientificName + "\"") + ", sex=" + (sex == null ? "null" : "\"" + sex + "\"") + ", spots=" + (spots == null ? "null" : "\"" + spots + "\"") + ", sraExperimentAccession=" + (sraExperimentAccession == null ? "null" : "\"" + sraExperimentAccession + "\"") + ", sraRunAccession=" + (sraRunAccession == null ? "null" : "\"" + sraRunAccession + "\"") + ", sraSampleAccession=" + (sraSampleAccession == null ? "null" : "\"" + sraSampleAccession + "\"") + ", sraStudyAccession=" + (sraStudyAccession == null ? "null" : "\"" + sraStudyAccession + "\"") + ", sraSubmissionAccession=" + (sraSubmissionAccession == null ? "null" : "\"" + sraSubmissionAccession + "\"") + ", stage=" + (stage == null ? "null" : "\"" + stage + "\"") + ", tissueType=" + (tissueType == null ? "null" : "\"" + tissueType + "\"") + ", treatment=" + (treatment == null ? "null" : "\"" + treatment + "\"") + ", tumor=" + (tumor == null ? "null" : "\"" + tumor + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("sampleName".equals(fieldName)) {
            return sampleName;
        }
        if ("sraStudyAccession".equals(fieldName)) {
            return sraStudyAccession;
        }
        if ("sampleType".equals(fieldName)) {
            return sampleType;
        }
        if ("instrument".equals(fieldName)) {
            return instrument;
        }
        if ("sex".equals(fieldName)) {
            return sex;
        }
        if ("design".equals(fieldName)) {
            return design;
        }
        if ("projectId".equals(fieldName)) {
            return projectId;
        }
        if ("sraSampleAccession".equals(fieldName)) {
            return sraSampleAccession;
        }
        if ("results".equals(fieldName)) {
            return results;
        }
        if ("sraSubmissionAccession".equals(fieldName)) {
            return sraSubmissionAccession;
        }
        if ("libraryName".equals(fieldName)) {
            return libraryName;
        }
        if ("librarySelection".equals(fieldName)) {
            return librarySelection;
        }
        if ("tissueType".equals(fieldName)) {
            return tissueType;
        }
        if ("scientificName".equals(fieldName)) {
            return scientificName;
        }
        if ("spots".equals(fieldName)) {
            return spots;
        }
        if ("libraryStrategy".equals(fieldName)) {
            return libraryStrategy;
        }
        if ("beeType".equals(fieldName)) {
            return beeType;
        }
        if ("insertSizeStandardDeviation".equals(fieldName)) {
            return insertSizeStandardDeviation;
        }
        if ("ftpLocation".equals(fieldName)) {
            return ftpLocation;
        }
        if ("sraExperimentAccession".equals(fieldName)) {
            return sraExperimentAccession;
        }
        if ("libraryLayout".equals(fieldName)) {
            return libraryLayout;
        }
        if ("bases".equals(fieldName)) {
            return bases;
        }
        if ("experimentAbstract".equals(fieldName)) {
            return experimentAbstract;
        }
        if ("sraRunAccession".equals(fieldName)) {
            return sraRunAccession;
        }
        if ("insertSize".equals(fieldName)) {
            return insertSize;
        }
        if ("bioSampleId".equals(fieldName)) {
            return bioSampleId;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("averageReadLength".equals(fieldName)) {
            return averageReadLength;
        }
        if ("stage".equals(fieldName)) {
            return stage;
        }
        if ("tumor".equals(fieldName)) {
            return tumor;
        }
        if ("centerName".equals(fieldName)) {
            return centerName;
        }
        if ("sampleTaxon".equals(fieldName)) {
            return sampleTaxon;
        }
        if ("treatment".equals(fieldName)) {
            return treatment;
        }
        if ("projectGoal".equals(fieldName)) {
            return projectGoal;
        }
        if ("platform".equals(fieldName)) {
            return platform;
        }
        if ("objective".equals(fieldName)) {
            return objective;
        }
        if ("bioProjectId".equals(fieldName)) {
            return bioProjectId;
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
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("sampleName".equals(fieldName)) {
            return sampleName;
        }
        if ("sraStudyAccession".equals(fieldName)) {
            return sraStudyAccession;
        }
        if ("sampleType".equals(fieldName)) {
            return sampleType;
        }
        if ("instrument".equals(fieldName)) {
            return instrument;
        }
        if ("sex".equals(fieldName)) {
            return sex;
        }
        if ("design".equals(fieldName)) {
            return design;
        }
        if ("projectId".equals(fieldName)) {
            return projectId;
        }
        if ("sraSampleAccession".equals(fieldName)) {
            return sraSampleAccession;
        }
        if ("results".equals(fieldName)) {
            return results;
        }
        if ("sraSubmissionAccession".equals(fieldName)) {
            return sraSubmissionAccession;
        }
        if ("libraryName".equals(fieldName)) {
            return libraryName;
        }
        if ("librarySelection".equals(fieldName)) {
            return librarySelection;
        }
        if ("tissueType".equals(fieldName)) {
            return tissueType;
        }
        if ("scientificName".equals(fieldName)) {
            return scientificName;
        }
        if ("spots".equals(fieldName)) {
            return spots;
        }
        if ("libraryStrategy".equals(fieldName)) {
            return libraryStrategy;
        }
        if ("beeType".equals(fieldName)) {
            return beeType;
        }
        if ("insertSizeStandardDeviation".equals(fieldName)) {
            return insertSizeStandardDeviation;
        }
        if ("ftpLocation".equals(fieldName)) {
            return ftpLocation;
        }
        if ("sraExperimentAccession".equals(fieldName)) {
            return sraExperimentAccession;
        }
        if ("libraryLayout".equals(fieldName)) {
            return libraryLayout;
        }
        if ("bases".equals(fieldName)) {
            return bases;
        }
        if ("experimentAbstract".equals(fieldName)) {
            return experimentAbstract;
        }
        if ("sraRunAccession".equals(fieldName)) {
            return sraRunAccession;
        }
        if ("insertSize".equals(fieldName)) {
            return insertSize;
        }
        if ("bioSampleId".equals(fieldName)) {
            return bioSampleId;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("averageReadLength".equals(fieldName)) {
            return averageReadLength;
        }
        if ("stage".equals(fieldName)) {
            return stage;
        }
        if ("tumor".equals(fieldName)) {
            return tumor;
        }
        if ("centerName".equals(fieldName)) {
            return centerName;
        }
        if ("sampleTaxon".equals(fieldName)) {
            return sampleTaxon;
        }
        if ("treatment".equals(fieldName)) {
            return treatment;
        }
        if ("projectGoal".equals(fieldName)) {
            return projectGoal;
        }
        if ("platform".equals(fieldName)) {
            return platform;
        }
        if ("objective".equals(fieldName)) {
            return objective;
        }
        if ("bioProjectId".equals(fieldName)) {
            return bioProjectId;
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
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("sampleName".equals(fieldName)) {
            sampleName = (java.lang.String) value;
        } else if ("sraStudyAccession".equals(fieldName)) {
            sraStudyAccession = (java.lang.String) value;
        } else if ("sampleType".equals(fieldName)) {
            sampleType = (java.lang.String) value;
        } else if ("instrument".equals(fieldName)) {
            instrument = (java.lang.String) value;
        } else if ("sex".equals(fieldName)) {
            sex = (java.lang.String) value;
        } else if ("design".equals(fieldName)) {
            design = (java.lang.String) value;
        } else if ("projectId".equals(fieldName)) {
            projectId = (java.lang.String) value;
        } else if ("sraSampleAccession".equals(fieldName)) {
            sraSampleAccession = (java.lang.String) value;
        } else if ("results".equals(fieldName)) {
            results = (java.lang.String) value;
        } else if ("sraSubmissionAccession".equals(fieldName)) {
            sraSubmissionAccession = (java.lang.String) value;
        } else if ("libraryName".equals(fieldName)) {
            libraryName = (java.lang.String) value;
        } else if ("librarySelection".equals(fieldName)) {
            librarySelection = (java.lang.String) value;
        } else if ("tissueType".equals(fieldName)) {
            tissueType = (java.lang.String) value;
        } else if ("scientificName".equals(fieldName)) {
            scientificName = (java.lang.String) value;
        } else if ("spots".equals(fieldName)) {
            spots = (java.lang.String) value;
        } else if ("libraryStrategy".equals(fieldName)) {
            libraryStrategy = (java.lang.String) value;
        } else if ("beeType".equals(fieldName)) {
            beeType = (java.lang.String) value;
        } else if ("insertSizeStandardDeviation".equals(fieldName)) {
            insertSizeStandardDeviation = (java.lang.String) value;
        } else if ("ftpLocation".equals(fieldName)) {
            ftpLocation = (java.lang.String) value;
        } else if ("sraExperimentAccession".equals(fieldName)) {
            sraExperimentAccession = (java.lang.String) value;
        } else if ("libraryLayout".equals(fieldName)) {
            libraryLayout = (java.lang.String) value;
        } else if ("bases".equals(fieldName)) {
            bases = (java.lang.String) value;
        } else if ("experimentAbstract".equals(fieldName)) {
            experimentAbstract = (java.lang.String) value;
        } else if ("sraRunAccession".equals(fieldName)) {
            sraRunAccession = (java.lang.String) value;
        } else if ("insertSize".equals(fieldName)) {
            insertSize = (java.lang.String) value;
        } else if ("bioSampleId".equals(fieldName)) {
            bioSampleId = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("averageReadLength".equals(fieldName)) {
            averageReadLength = (java.lang.Integer) value;
        } else if ("stage".equals(fieldName)) {
            stage = (java.lang.String) value;
        } else if ("tumor".equals(fieldName)) {
            tumor = (java.lang.String) value;
        } else if ("centerName".equals(fieldName)) {
            centerName = (java.lang.String) value;
        } else if ("sampleTaxon".equals(fieldName)) {
            sampleTaxon = (java.lang.String) value;
        } else if ("treatment".equals(fieldName)) {
            treatment = (java.lang.String) value;
        } else if ("projectGoal".equals(fieldName)) {
            projectGoal = (java.lang.String) value;
        } else if ("platform".equals(fieldName)) {
            platform = (java.lang.String) value;
        } else if ("objective".equals(fieldName)) {
            objective = (java.lang.String) value;
        } else if ("bioProjectId".equals(fieldName)) {
            bioProjectId = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("sampleName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sraStudyAccession".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sampleType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("instrument".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sex".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("design".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("projectId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sraSampleAccession".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("results".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sraSubmissionAccession".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("libraryName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("librarySelection".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("tissueType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("scientificName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("spots".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("libraryStrategy".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("beeType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("insertSizeStandardDeviation".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ftpLocation".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sraExperimentAccession".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("libraryLayout".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bases".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("experimentAbstract".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sraRunAccession".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("insertSize".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bioSampleId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("averageReadLength".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("stage".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("tumor".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("centerName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("sampleTaxon".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("treatment".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("projectGoal".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("platform".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("objective".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bioProjectId".equals(fieldName)) {
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
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExpressionMetadata.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionMetadataShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExpressionMetadata");
        if (sampleName != null) {
            sb.append("$_^asampleName$_^");
            String string = sampleName;
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
        if (sraStudyAccession != null) {
            sb.append("$_^asraStudyAccession$_^");
            String string = sraStudyAccession;
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
        if (sampleType != null) {
            sb.append("$_^asampleType$_^");
            String string = sampleType;
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
        if (instrument != null) {
            sb.append("$_^ainstrument$_^");
            String string = instrument;
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
        if (sex != null) {
            sb.append("$_^asex$_^");
            String string = sex;
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
        if (projectId != null) {
            sb.append("$_^aprojectId$_^");
            String string = projectId;
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
        if (sraSampleAccession != null) {
            sb.append("$_^asraSampleAccession$_^");
            String string = sraSampleAccession;
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
        if (results != null) {
            sb.append("$_^aresults$_^");
            String string = results;
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
        if (sraSubmissionAccession != null) {
            sb.append("$_^asraSubmissionAccession$_^");
            String string = sraSubmissionAccession;
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
        if (libraryName != null) {
            sb.append("$_^alibraryName$_^");
            String string = libraryName;
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
        if (librarySelection != null) {
            sb.append("$_^alibrarySelection$_^");
            String string = librarySelection;
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
        if (tissueType != null) {
            sb.append("$_^atissueType$_^");
            String string = tissueType;
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
        if (scientificName != null) {
            sb.append("$_^ascientificName$_^");
            String string = scientificName;
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
        if (spots != null) {
            sb.append("$_^aspots$_^");
            String string = spots;
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
        if (libraryStrategy != null) {
            sb.append("$_^alibraryStrategy$_^");
            String string = libraryStrategy;
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
        if (beeType != null) {
            sb.append("$_^abeeType$_^");
            String string = beeType;
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
        if (insertSizeStandardDeviation != null) {
            sb.append("$_^ainsertSizeStandardDeviation$_^");
            String string = insertSizeStandardDeviation;
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
        if (ftpLocation != null) {
            sb.append("$_^aftpLocation$_^");
            String string = ftpLocation;
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
        if (sraExperimentAccession != null) {
            sb.append("$_^asraExperimentAccession$_^");
            String string = sraExperimentAccession;
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
        if (libraryLayout != null) {
            sb.append("$_^alibraryLayout$_^");
            String string = libraryLayout;
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
        if (bases != null) {
            sb.append("$_^abases$_^");
            String string = bases;
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
        if (experimentAbstract != null) {
            sb.append("$_^aexperimentAbstract$_^");
            String string = experimentAbstract;
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
        if (sraRunAccession != null) {
            sb.append("$_^asraRunAccession$_^");
            String string = sraRunAccession;
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
        if (insertSize != null) {
            sb.append("$_^ainsertSize$_^");
            String string = insertSize;
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
        if (bioSampleId != null) {
            sb.append("$_^abioSampleId$_^");
            String string = bioSampleId;
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
        if (averageReadLength != null) {
            sb.append("$_^aaverageReadLength$_^").append(averageReadLength);
        }
        if (stage != null) {
            sb.append("$_^astage$_^");
            String string = stage;
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
        if (tumor != null) {
            sb.append("$_^atumor$_^");
            String string = tumor;
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
        if (centerName != null) {
            sb.append("$_^acenterName$_^");
            String string = centerName;
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
        if (sampleTaxon != null) {
            sb.append("$_^asampleTaxon$_^");
            String string = sampleTaxon;
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
        if (treatment != null) {
            sb.append("$_^atreatment$_^");
            String string = treatment;
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
        if (projectGoal != null) {
            sb.append("$_^aprojectGoal$_^");
            String string = projectGoal;
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
        if (objective != null) {
            sb.append("$_^aobjective$_^");
            String string = objective;
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
        if (bioProjectId != null) {
            sb.append("$_^abioProjectId$_^");
            String string = bioProjectId;
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
        if (!org.intermine.model.bio.ExpressionMetadataShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExpressionMetadata)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "asampleName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sampleName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asraStudyAccession".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sraStudyAccession = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asampleType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sampleType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ainstrument".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                instrument = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asex".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sex = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aprojectId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                projectId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asraSampleAccession".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sraSampleAccession = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aresults".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                results = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asraSubmissionAccession".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sraSubmissionAccession = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibraryName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                libraryName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibrarySelection".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                librarySelection = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atissueType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                tissueType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ascientificName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                scientificName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aspots".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                spots = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibraryStrategy".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                libraryStrategy = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abeeType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                beeType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ainsertSizeStandardDeviation".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                insertSizeStandardDeviation = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aftpLocation".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                ftpLocation = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asraExperimentAccession".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sraExperimentAccession = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alibraryLayout".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                libraryLayout = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abases".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bases = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aexperimentAbstract".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                experimentAbstract = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asraRunAccession".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sraRunAccession = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ainsertSize".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                insertSize = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abioSampleId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bioSampleId = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aaverageReadLength".equals(notXml[i])) {
                i++;
                averageReadLength = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "astage".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                stage = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atumor".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                tumor = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acenterName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                centerName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asampleTaxon".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sampleTaxon = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atreatment".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                treatment = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aprojectGoal".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                projectGoal = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aobjective".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                objective = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abioProjectId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bioProjectId = string == null ? notXml[i] : string.toString();
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
            if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
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
        if (!org.intermine.model.bio.ExpressionMetadata.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExpressionMetadata.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
