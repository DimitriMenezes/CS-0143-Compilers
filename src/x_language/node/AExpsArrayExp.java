/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AExpsArrayExp extends PArrayExp
{
    private PExp _exp_;
    private TComma _comma_;
    private PArrayExp _arrayExp_;

    public AExpsArrayExp()
    {
        // Constructor
    }

    public AExpsArrayExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PArrayExp _arrayExp_)
    {
        // Constructor
        setExp(_exp_);

        setComma(_comma_);

        setArrayExp(_arrayExp_);

    }

    @Override
    public Object clone()
    {
        return new AExpsArrayExp(
            cloneNode(this._exp_),
            cloneNode(this._comma_),
            cloneNode(this._arrayExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpsArrayExp(this);
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

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PArrayExp getArrayExp()
    {
        return this._arrayExp_;
    }

    public void setArrayExp(PArrayExp node)
    {
        if(this._arrayExp_ != null)
        {
            this._arrayExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrayExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._comma_)
            + toString(this._arrayExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._arrayExp_ == child)
        {
            this._arrayExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._arrayExp_ == oldChild)
        {
            setArrayExp((PArrayExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}