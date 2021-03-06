/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class ARealNumberExp extends PExp
{
    private TRealNumber _realNumber_;

    public ARealNumberExp()
    {
        // Constructor
    }

    public ARealNumberExp(
        @SuppressWarnings("hiding") TRealNumber _realNumber_)
    {
        // Constructor
        setRealNumber(_realNumber_);

    }

    @Override
    public Object clone()
    {
        return new ARealNumberExp(
            cloneNode(this._realNumber_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealNumberExp(this);
    }

    public TRealNumber getRealNumber()
    {
        return this._realNumber_;
    }

    public void setRealNumber(TRealNumber node)
    {
        if(this._realNumber_ != null)
        {
            this._realNumber_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._realNumber_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._realNumber_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._realNumber_ == child)
        {
            this._realNumber_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._realNumber_ == oldChild)
        {
            setRealNumber((TRealNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
