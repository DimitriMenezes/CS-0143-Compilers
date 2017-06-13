/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AArgsListArgs extends PListArgs
{
    private PListArgs _listArgs_;
    private PExp _exp_;

    public AArgsListArgs()
    {
        // Constructor
    }

    public AArgsListArgs(
        @SuppressWarnings("hiding") PListArgs _listArgs_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setListArgs(_listArgs_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AArgsListArgs(
            cloneNode(this._listArgs_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArgsListArgs(this);
    }

    public PListArgs getListArgs()
    {
        return this._listArgs_;
    }

    public void setListArgs(PListArgs node)
    {
        if(this._listArgs_ != null)
        {
            this._listArgs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listArgs_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._listArgs_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._listArgs_ == child)
        {
            this._listArgs_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._listArgs_ == oldChild)
        {
            setListArgs((PListArgs) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
