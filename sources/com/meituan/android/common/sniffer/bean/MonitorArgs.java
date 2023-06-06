package com.meituan.android.common.sniffer.bean;

import com.meituan.android.common.sniffer.bean.MonitorConfig;
import com.meituan.android.common.sniffer.bean.MonitorConfig.Command;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MonitorArgs<T extends MonitorConfig.Command> {
    public Object[] args;
    public T command;
    public Object current;
    @Deprecated
    public String describe;
    public Map<String, String> exts;
    public String methodNumber;
    @Deprecated
    public String module;
    @Deprecated
    public String type;
}
