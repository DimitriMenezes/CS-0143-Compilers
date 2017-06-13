/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class ABlockCommandBlockScope extends PBlockScope
{
    private PCommand _command_;

    public ABlockCommandBlockScope()
    {
        // Constructor
    }

    public ABlockCommandBlockScope(
        @SuppressWarnings("hiding") PCommand _command_)
    {
        // Constructor
        setCommand(_command_);

    }

    @Override
    public Object clone()
    {
        return new ABlockCommandBlockScope(
            cloneNode(this._command_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlockCommandBlockScope(this);
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
            + toString(this._command_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
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
        if(this._command_ == oldChild)
        {
            setCommand((PCommand) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}