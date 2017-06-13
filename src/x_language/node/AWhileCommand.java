/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AWhileCommand extends PCommand
{
    private PExp _exp_;
    private PCommand _command_;

    public AWhileCommand()
    {
        // Constructor
    }

    public AWhileCommand(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") PCommand _command_)
    {
        // Constructor
        setExp(_exp_);

        setCommand(_command_);

    }

    @Override
    public Object clone()
    {
        return new AWhileCommand(
            cloneNode(this._exp_),
            cloneNode(this._command_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileCommand(this);
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

    public PCommand getCommand()
    {
        return this._command_;
    }

    public void setCommand(PCommand node)
    {
        if(this._command_ != null)
        {
            this._command_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._command_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._command_);
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

        if(this._command_ == child)
        {
            this._command_ = null;
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

        if(this._command_ == oldChild)
        {
            setCommand((PCommand) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
