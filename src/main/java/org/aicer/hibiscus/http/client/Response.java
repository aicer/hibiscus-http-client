/**
 * Copyright 2012-2013 American Institute for Computing Education and Research Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aicer.hibiscus.http.client;

import org.apache.http.Header;


public class Response {

    // Contains the response body
    private String body = null;

    // Contains the status line
    private String statusLine = null;

    // Contains the response code
    private int responseCode = 0;

    // Contains the elapsed time in milliseconds
    private long elapsedTime = 0;

    // Stores the HTTP response headers
    private Header[] responseHeaders;

    /**
     * Constructor
     *
     */
    public Response() {

    }

    /**
     * Returns the HTTP status line
     *
     * @return
     */
    public String getStatusLine() {
        return statusLine;
    }

    /**
     * Specifies the HTTP status line
     *
     * @param statusLine
     * @return
     */
    public final Response setStatusLine(final String statusLine) {

        this.statusLine = statusLine;

        final String[] statusPieces = statusLine.split(" ");

        if (statusPieces.length > 1) {
            responseCode = Integer.parseInt(statusPieces[1]);
        }

        return this;
    }

    /**
     * Returns the HTTP response headers for the response
     * @return
     */
    public Header[] getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Sets the response headers
     *
     * @param responseHeaders
     * @return
     */
    public Response setResponseHeaders(final Header[] responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }

    /**
     * Returns the HTTP response code for the request
     *
     * @return
     */
    public int getResponseCode() {
        return responseCode;
    }

    public Response setResponseCode(final int responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * Returns the response body for the request if any
     *
     * @return
     */
    public String getResponseBody() {
        return body;
    }

    /**
     * Sets the response body if applicable
     *
     * @param body
     * @return
     */
    public Response setResponseBody(final String body) {
        this.body = body;
        return this;
    }

    /**
     * Returns the elapsed time for this request in milliseconds
     *
     * @return
     */
    public long getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Specifies the elapsed time for this request in milliseconds
     *
     * @param elapsedTime
     * @return
     */
    public Response setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }
}
