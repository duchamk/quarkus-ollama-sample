/*
 * Copyright 2024 <a href="mailto:albert.kubicki@wp.pl">Albert Michał Kubicki</a>.
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
package prv.duchamk.test.ollama.service;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import prv.duchamk.test.ollama.client.OllamaAi;

/**
 *
 * @author <a href="mailto:albert.kubicki@wp.pl">Albert Michał Kubicki</a>
 */
@Path("/ollama")
public class OllamaService {
    
    @Inject
    OllamaAi ollamaAi;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getOllama() {
        return ollamaAi.answerQuestion("Describe Quine–McCluskey algorithm.");
    }
    
}
