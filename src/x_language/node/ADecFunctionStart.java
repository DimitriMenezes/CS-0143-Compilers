/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class ADecFunctionStart extends PStart
{
    private PDecFunction _decFunction_;

    public ADecFunctionStart()
    {
        // Constructor
    }

    public ADecFunctionStart(
        @SuppressWarnings("hiding") PDecFunction _decFunction_)
    {
        // Constructor
        setDecFunction(_decFunction_);

    }

    @Override
    public Object clone()
    {
        return new ADecFunctionStart(
            cloneNode(this._decFunction_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecFunctionStart(this);
    }

    public PDecFunction getDecFunction()
    {
        return this._decFunction_;
    }

    public void setDecFunction(PDecFunction node)
    {
        if(this._decFunction_ != null)
        {
            this._decFunction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decFunction_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decFunction_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decFunction_ == child)
        {
            this._decFunction_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decFunction_ == oldChild)
        {
            setDecFunction((PDecFunction) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
