package org.jenkinsci.plugins.gitclient;

import java.io.Writer;

public interface SubmoduleStatusCommand extends GitCommand
{
    /**
     * If set true, submodule status check will be recursive.  Default is
     * non-recursive.
     *
     * @param recursive if true, will recursively check submodules status (requires git&gt;=1.6.5)
     * @return a {@link org.jenkinsci.plugins.gitclient.SubmoduleUpdateCommand} object.
     */
    SubmoduleStatusCommand recursive(boolean recursive);

    /**
     * Sets the {@link java.io.OutputStream} that receives the status.
     *
     * @param w a {@link java.io.Writer} object.
     * @return a {@link org.jenkinsci.plugins.gitclient.SubmoduleStatusCommand} object.
     */
    SubmoduleStatusCommand to(Writer w);
}
