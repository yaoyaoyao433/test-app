package com.meituan.android.common.sniffer.bean;

import com.meituan.android.common.sniffer.annotation.type.SnifferBoolean;
import com.meituan.android.common.sniffer.annotation.type.SnifferCondition;
import com.meituan.android.common.sniffer.annotation.type.SnifferScope;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MonitorConfig {
    public String className;
    public Set<Command> commandList;
    public String methodNumber;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CustomCommand extends Command {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class EndCommand extends Command {
        public String key;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ForwardCommand extends Command {
        public String targetClass = "";
        public int step = 1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HttpCommand extends Command {
        public String host;
        public String[] path;
        public Set<String> urls = new HashSet();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class NormalCommand extends Command {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class StartCommand extends Command {
        public String key;
        public long timeout = 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ViewCommand extends Command {
        public SnifferBoolean clickable = SnifferBoolean.NULL;
        public int width = -1;
        public int height = -1;
        public int visibility = -1;
        public SnifferBoolean enabled = SnifferBoolean.NULL;
        public int[] id = new int[0];
        public long delay = 0;
        public int interval = 1000;
        public SnifferBoolean empty = SnifferBoolean.NULL;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Command {
        public String business;
        public String commandId;
        public String describe;
        public String luaKey;
        public String luaScript;
        public String module;
        public String type;
        public SnifferCondition[] conditions = {SnifferCondition.ANY};
        public SnifferScope scope = SnifferScope.UNSPECIFIED;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Command command = (Command) obj;
            if (this.commandId == null ? command.commandId == null : this.commandId.equals(command.commandId)) {
                return this.module == null ? command.module == null : this.module.equals(command.module);
            }
            return false;
        }

        public int hashCode() {
            return ((this.type != null ? this.type.hashCode() : 0) * 31) + (this.module != null ? this.module.hashCode() : 0);
        }
    }
}
