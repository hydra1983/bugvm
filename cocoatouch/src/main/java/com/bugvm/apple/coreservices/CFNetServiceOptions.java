/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.coreservices;

/*<imports>*/
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CFNetServiceOptions/*</name>*/ extends Bits</*<name>*/CFNetServiceOptions/*</name>*/> {
    /*<values>*/
    public static final CFNetServiceOptions None = new CFNetServiceOptions(0L);
    public static final CFNetServiceOptions NoAutoRename = new CFNetServiceOptions(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CFNetServiceOptions/*</name>*/[] values = _values(/*<name>*/CFNetServiceOptions/*</name>*/.class);

    public /*<name>*/CFNetServiceOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/CFNetServiceOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CFNetServiceOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CFNetServiceOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/CFNetServiceOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CFNetServiceOptions/*</name>*/[] values() {
        return values.clone();
    }
}