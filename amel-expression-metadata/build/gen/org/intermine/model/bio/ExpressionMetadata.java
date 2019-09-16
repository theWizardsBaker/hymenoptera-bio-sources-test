package org.intermine.model.bio;

public interface ExpressionMetadata extends org.intermine.model.InterMineObject
{
    public java.lang.String getSampleName();
    public void setSampleName(final java.lang.String sampleName);

    public java.lang.String getSraStudyAccession();
    public void setSraStudyAccession(final java.lang.String sraStudyAccession);

    public java.lang.String getSampleType();
    public void setSampleType(final java.lang.String sampleType);

    public java.lang.String getInstrument();
    public void setInstrument(final java.lang.String instrument);

    public java.lang.String getSex();
    public void setSex(final java.lang.String sex);

    public java.lang.String getDesign();
    public void setDesign(final java.lang.String design);

    public java.lang.String getProjectId();
    public void setProjectId(final java.lang.String projectId);

    public java.lang.String getSraSampleAccession();
    public void setSraSampleAccession(final java.lang.String sraSampleAccession);

    public java.lang.String getResults();
    public void setResults(final java.lang.String results);

    public java.lang.String getSraSubmissionAccession();
    public void setSraSubmissionAccession(final java.lang.String sraSubmissionAccession);

    public java.lang.String getLibraryName();
    public void setLibraryName(final java.lang.String libraryName);

    public java.lang.String getLibrarySelection();
    public void setLibrarySelection(final java.lang.String librarySelection);

    public java.lang.String getTissueType();
    public void setTissueType(final java.lang.String tissueType);

    public java.lang.String getScientificName();
    public void setScientificName(final java.lang.String scientificName);

    public java.lang.String getSpots();
    public void setSpots(final java.lang.String spots);

    public java.lang.String getLibraryStrategy();
    public void setLibraryStrategy(final java.lang.String libraryStrategy);

    public java.lang.String getBeeType();
    public void setBeeType(final java.lang.String beeType);

    public java.lang.String getInsertSizeStandardDeviation();
    public void setInsertSizeStandardDeviation(final java.lang.String insertSizeStandardDeviation);

    public java.lang.String getFtpLocation();
    public void setFtpLocation(final java.lang.String ftpLocation);

    public java.lang.String getSraExperimentAccession();
    public void setSraExperimentAccession(final java.lang.String sraExperimentAccession);

    public java.lang.String getLibraryLayout();
    public void setLibraryLayout(final java.lang.String libraryLayout);

    public java.lang.String getBases();
    public void setBases(final java.lang.String bases);

    public java.lang.String getExperimentAbstract();
    public void setExperimentAbstract(final java.lang.String experimentAbstract);

    public java.lang.String getSraRunAccession();
    public void setSraRunAccession(final java.lang.String sraRunAccession);

    public java.lang.String getInsertSize();
    public void setInsertSize(final java.lang.String insertSize);

    public java.lang.String getBioSampleId();
    public void setBioSampleId(final java.lang.String bioSampleId);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.Integer getAverageReadLength();
    public void setAverageReadLength(final java.lang.Integer averageReadLength);

    public java.lang.String getStage();
    public void setStage(final java.lang.String stage);

    public java.lang.String getTumor();
    public void setTumor(final java.lang.String tumor);

    public java.lang.String getCenterName();
    public void setCenterName(final java.lang.String centerName);

    public java.lang.String getSampleTaxon();
    public void setSampleTaxon(final java.lang.String sampleTaxon);

    public java.lang.String getTreatment();
    public void setTreatment(final java.lang.String treatment);

    public java.lang.String getProjectGoal();
    public void setProjectGoal(final java.lang.String projectGoal);

    public java.lang.String getPlatform();
    public void setPlatform(final java.lang.String platform);

    public java.lang.String getObjective();
    public void setObjective(final java.lang.String objective);

    public java.lang.String getBioProjectId();
    public void setBioProjectId(final java.lang.String bioProjectId);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
