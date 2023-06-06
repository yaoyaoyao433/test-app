package org.apache.flink.cep.mlink;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface e<IN> extends Serializable, org.apache.flink.cep.common.function.a {
    void timeout(Map<String, List<IN>> map) throws Exception;
}
