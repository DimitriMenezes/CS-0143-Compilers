/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AIfElseCommand extends PIfElseCommand
{
    private PExp _exp_;
    private PCommand _l_;
    private PCommand _r_;

    public AIfElseCommand()
    {
        // Constructor
    }

    public AIfElseCommand(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") PCommand _l_,
        @SuppressWarnings("hiding") PCommand _r_)
    {
        // Constructor
        setExp(_exp_);

        setL(_l_);

        setR(_r_);

    }

    @Override
    public Object clone()
    {
        return new AIfElseCommand(
            cloneNode(this._exp_),
            cloneNode(this._l_),
            cloneNode(this._r_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfElseCommand(this);
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

    public PCommand getL()
    {
        return this._l_;
    }

    public void setL(PCommand node)
    {
        if(this._l_ != null)
        {
            this._l_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l_ = node;
    }

    public PCommand getR()
    {
        return this._r_;
    }

    public void setR(PCommand node)
    {
        if(this._r_ != null)
        {
            this._r_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._r_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._l_)
            + toString(this._r_);
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

        if(this._l_ == child)
        {
            this._l_ = null;
            return;
        }

        if(this._r_ == child)
        {
            this._r_ = null;
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

        if(this._l_ == oldChild)
        {
            setL((PCommand) newChild);
            return;
        }

        if(this._r_ == oldChild)
        {
            setR((PCommand) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}