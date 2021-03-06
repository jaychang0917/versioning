/*
 * Copyright 2018 Tadej Slamic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.tadej.versioning.cmd

import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.nio.charset.Charset

internal class StringConverter(
    internal val charset: Charset = Charsets.UTF_8
) : CommandLineConverter<String> {

    override fun convert(outputStream: OutputStream): String {
        val stream = outputStream as ByteArrayOutputStream
        return stream.toString(charset.name()).trim()
    }
}
