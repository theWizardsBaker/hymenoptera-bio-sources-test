package org.intermine.model.bio;

public interface Transcript extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

    public java.util.Set<org.intermine.model.bio.Expression> getExpressionValues();
    public void setExpressionValues(final java.util.Set<org.intermine.model.bio.Expression> expressionValues);
    public void addExpressionValues(final org.intermine.model.bio.Expression arg);

}
