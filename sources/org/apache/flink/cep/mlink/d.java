package org.apache.flink.cep.mlink;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface d<IN> extends Serializable, org.apache.flink.cep.common.function.a {
    void flatSelect(Map<String, List<IN>> map, int i) throws Exception;
}
