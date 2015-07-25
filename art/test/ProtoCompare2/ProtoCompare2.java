/*
 * Copyright (C) 2011 The Android Open Source Project
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

class ProtoCompare2 {
    int m1(short x, int y, long z) { return x + y + (int)z; }
    int m2(short x, int y, long z) { return x + y + (int)z; }
    int m3(long x, int y, short z) { return (int)x + y + z; }
    long m4(long x, int y, short z) { return x + y + z; }
}
