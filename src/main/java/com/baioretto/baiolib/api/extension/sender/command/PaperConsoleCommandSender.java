package com.baioretto.baiolib.api.extension.sender.command;

import com.baioretto.baiolib.api.AbstractUtil;

/**
 * Get {@link IConsoleCommandSender} implementation class instance.
 *
 * @author baioretto
 * @since 1.1.0
 */
@SuppressWarnings("unused")
public class PaperConsoleCommandSender extends AbstractUtil<IConsoleCommandSender> {
    protected PaperConsoleCommandSender() {
        super(IConsoleCommandSender.class);
    }
}
